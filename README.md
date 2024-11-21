# AutomatasCompilation
A compilation of automatas I made for the course Languages and Machines in Universidad De Los Andes

# DFAs
Deterministic Finite Automatas

---
## 1. Cat Even

<img width="542" alt="Screenshot 2024-10-15 at 3 00 43 PM" src="https://github.com/user-attachments/assets/5ada6d2f-37fb-4743-9700-851df93e2f23">

Recognizes strings that has even quantity of cats
`catchthatcat` or `catchingcat` or  `catcat` or `catcatttcatcath`
Rejects strings with odd quantity of cats
`catcatcat` or `catchingthatcattttcat` or `cat`

## 2. Inequalities

<img width="475" alt="Screenshot 2024-10-20 at 9 29 13 PM" src="https://github.com/user-attachments/assets/b4e1cf0d-ef7c-4944-a77f-8947bdd31c3c">

Recognizes not only the syntax and grammar of the string but also the semantic, so it accepts strings like
`4>3` or `4=4>2>1=1>0` or `9>1<2<3<8=8>2>1>0` 
And it rejects strings like 
`3>4` or `5=4` or `6>3>2>0>9>2>6=0=2` or `>2` or `4>>3`

It took a lot of states...

<img width="569" alt="Screenshot 2024-10-20 at 9 52 31 PM" src="https://github.com/user-attachments/assets/b7f3852e-3356-4eda-a187-49db2e15f2b8">

But a simpler way of understanding how it works is presented here:

![WhatsApp Image 2024-10-17 at 5 59 01 PM](https://github.com/user-attachments/assets/07d2c3d0-edb5-4467-bacb-7f9d2936d5f1)

## 3. |A| |B| |C| mod 2 Transducer

### Coder
<img width="371" alt="Screenshot 2024-10-21 at 7 42 42 PM" src="https://github.com/user-attachments/assets/1c9cb0ea-0691-4776-80ba-2aa38bb7cf1c">

### Decoder
<img width="485" alt="Screenshot 2024-10-21 at 7 42 49 PM" src="https://github.com/user-attachments/assets/83dc19e9-c0dc-4dc2-925c-22f37a3ecd06">

### Explanation
Sorry that the explanation is in spanish but basically, we calculate a G that will be the value written in each transition, so if I am currently in 6 and read 2 we apply the formula ABS(6-2) = 4 then we convert to binary using always 3 bits (since we only want to represent a b and c) 100 and we get 1 a, 0 bs, 0 cs, that means we have to decode an A there. 

![Image 21-10-24 at 7 45 PM](https://github.com/user-attachments/assets/f59358a2-67db-449f-b6ca-7df4d9e4ca55)

### Simplification

![Image 21-10-24 at 7 47 PM](https://github.com/user-attachments/assets/937ac085-128f-4641-aedc-4d90ac47ede2)

So basically it's something like this, but since there's a lot of states, the decoder automatically calculates everything using the transition function and the value for G. 

### Example

We input this in the coder

<img width="770" alt="Screenshot 2024-10-21 at 7 42 32 PM" src="https://github.com/user-attachments/assets/50a0fb2f-2a44-4049-9b1e-a4c3dc586093">

Then we input the output of the coder in the decoder and we get the same result

<img width="770" alt="Screenshot 2024-10-21 at 7 42 20 PM" src="https://github.com/user-attachments/assets/76a4f7fe-3a95-42e6-9860-0235a4935b84">

# Transducers
Coders and decoders

---
## 1. Alphabet to binary Transducer
This one was pretty straightforward, it implements a coder that processes input strings containing the characters `a`, `b`, and `c` and outputs a string of numbers (`0` to `7`). The output represents the parity (mod 2) of the count of each character (`a`, `b`, `c`) read at each point in the input. Specifically:

- The coder writes numbers based on the parity (mod 2) of the counts of `a`s, `b`s, and `c`s it has seen so far.
- Each output number is calculated using the formula:  

```output = (a's mod 2) * 4 + (b's mod 2) * 2 + (c's mod 2)```

- This results in a single digit between `0` and `7` being written for each step.

The project is designed to demonstrate concepts in modular arithmetic and finite state encoding.

The following table shows how the output is determined based on the parity (mod 2) of the counts of `a`, `b`, and `c`:

| a's mod 2 | b's mod 2 | c's mod 2 | Output |
|-----------|-----------|-----------|--------|
|     0     |     0     |     0     |   0    |
|     0     |     0     |     1     |   1    |
|     0     |     1     |     0     |   2    |
|     0     |     1     |     1     |   3    |
|     1     |     0     |     0     |   4    |
|     1     |     0     |     1     |   5    |
|     1     |     1     |     0     |   6    |
|     1     |     1     |     1     |   7    |

The following are some examples of input strings and their corresponding outputs:

| Input                | Output            |
|----------------------|-------------------|
| `abccab`            | `0467620`         |
| `aaaa`              | `04040`           |
| `ababab`            | `0462046`         |
| `abccabcaabbcaacb`  | `0467310402015102`|
| `λ` (empty string)  | `0`               |


1. **Input:** `abccab`  
 - Read `a`: `a=1 (mod 2=1)`, `b=0`, `c=0` → Write `4`
 - Read `b`: `a=1`, `b=1 (mod 2=1)`, `c=0` → Write `6`
 - Read `c`: `a=1`, `b=1`, `c=1 (mod 2=1)` → Write `7`
 - Continue similarly until the end.

2. **Input:** `aaaa`  
 - Each `a` toggles its mod 2 parity between 0 and 1, resulting in alternating `4` and `0`.

3. **Empty Input:** `λ`  
 - No characters are read, so the output is `0`.

So the pattern was really this:

<img width="750" alt="Screenshot 2024-11-21 at 2 54 23 PM" src="https://github.com/user-attachments/assets/f7edb258-d9c8-497e-a43b-f3201401fe6a">

And the solution was built like this: (simplifying it)

<img width="686" alt="Screenshot 2024-11-21 at 2 54 34 PM" src="https://github.com/user-attachments/assets/8f304fb5-afde-42d0-ad11-c369c11047b5">


## 2. Coder Decoder Phrases (Modulus base) 

This one was the second full project of the course. It focuses on implementing an **encoder** and a **decoder** using the GOLD software. These components must process text strings according to specific rules, validating the encoding and decoding processes in both directions: from the original input to the encoded format and back.

The main objective is to work with **response automata** that handle strings formed by words separated by single spaces and ending with a period (`.`), ensuring the encoding and decoding rules are strictly followed.

We had to implement an automaton that processes a string of words separated by single spaces and ending with a period (`ω1 ω2 ... ωn.`). The automaton generates an encoded string in the following format:

```β1d1β2d2 ... βndn```

Where

- **`βi`:** This is derived from the word `ωi` using the following rules:
  - If `ωi = σ1σ2...σm`, then `βi = σ1ρ2...ρmσ1`.
  - For each letter `ρj` in the word:
    - If `σj = σ1`, then `ρj = (j % 3)`.
    - Otherwise, `ρj = σj`.

- **`di`:** Calculated as: `di = (length(ωi) + i) % 5`

The automaton rejects the following inputs:
- Strings that start with a space.
- Strings with more than one space between words or before the period.
- Strings containing characters after the period.

The decoder must process strings generated by the encoder automaton and validate that they comply with the encoding rules. The output must reconstruct the original string. The validations include:

1. The first letter (`σ1`) must appear correctly at the beginning and end of the word.
2. The values of `ρj` must match their positions in the substring, based on the encoding rules.
3. The values of `di` must be correct.
4. The numbers (`d1, d2, ...`) must appear in their appropriate positions.

Examples of Input and Output:

| Input                            | Encoded Output                         |
|----------------------------------|----------------------------------------|
| `exercises for codingdecoding.`  | `ex0rcis2se0forf0codingde0odingc2.`    |
| `aaaaa bbbbbbb ccccc.`           | `a2012a1b201201b4c2012c3.`            |
| `concocting examples.`           | `con1o0tingc1exampl1.`                |

- Each input is validated before being accepted by the automaton.
- Incorrectly formatted strings are rejected.

To understand it better:

<img width="1201" alt="Screenshot 2024-11-21 at 2 48 11 PM" src="https://github.com/user-attachments/assets/a5ceec13-658a-43ae-908b-956750856c9c">

An example of the execution of a string with the states of the solutions automata is shown below:

<img width="1473" alt="Screenshot 2024-11-21 at 2 47 48 PM" src="https://github.com/user-attachments/assets/4ca91aca-f45b-470d-9f5d-79f622fc036d">

# PDAs
PushDown Automatas

---

