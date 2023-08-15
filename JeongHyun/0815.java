{\rtf1\ansi\ansicpg949\cocoartf2708
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
\
class Solution \{\
    public long solution(int n, int[] works) \{\
        long answer = 0;\
        \
        int count = 0;\
        for(int i = 0; i < works.length; i++)\
            count += works[i];\
        if(count <= n) return 0; // \uc0\u45224 \u51008  \u51089 \u50629 \u47049  \u50630 \u45716  \u44221 \u50864 \
            \
        while(n != 0)\{\
            Arrays.sort(works); // \uc0\u45236 \u47548 \u52264 \u49692 \u51004 \u47196  \u51221 \u47148 \
            int max = works[works.length-1];\
            \
            for(int i = 0; i < works.length; i++)\{\
                if(works[i] == max)\{\
                    works[i]--;\
                    n--;\
                    \
                    if(n == 0) break;\
                \}\
            \}\
        \}\
        \
        for(int i = 0; i < works.length; i++)\
            answer += works[i] * works[i];\
        \
        return answer;\
    \}\
\}}