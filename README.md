# AutomatasCompilation
A compilation of automatas I made for the course Languages and Machines in Universidad De Los Andes

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

