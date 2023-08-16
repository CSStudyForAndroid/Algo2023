{\rtf1\ansi\ansicpg949\cocoartf2708
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
\
class Solution \{\
    public int solution(int[] A, int[] B) \{\
        int answer = 0;\
        PriorityQueue<Integer> pq = new PriorityQueue<>();\
        Arrays.sort(B);\
        \
        for(int i : A)\{\
            pq.offer(i);\
        \}\
     \
        while(!pq.isEmpty())\{\
            int a = pq.poll();\
            for(int i = answer; i < B.length; i++)\{\
                if(B[i] != 0 && a < B[i])\{\
                    B[i] = 0;\
                    answer++;\
                    break;\
                \}\
            \}\
        \}\
        \
        return answer;\
    \}\
\}}