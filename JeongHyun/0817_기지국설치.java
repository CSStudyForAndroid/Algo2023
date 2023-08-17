{\rtf1\ansi\ansicpg949\cocoartf2708
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf0 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 class Solution \{ public int solution(int n, int[] stations, int w) \{ int answer = 0; int position = 1; for(int i = 0; i < stations.length; i++)\{ while(position < stations[i] - w)\{ // \uc0\u44592 \u51316  \u44592 \u51648 \u44397  \u50812 \u51901  \u45149  \u50948 \u52824 \u48372 \u45796  \u50812 \u51901 \u50640  \u50948 \u52824 \u54624  \u46412  position += 2 * w + 1; answer++; // \u44592 \u51648 \u44397  \u49464 \u50864 \u44592  \} if(position > n) break; position = stations[i] + w + 1; // \u49352 \u47196  \u49464 \u50868  \u44592 \u51648 \u44397  \u50724 \u47480 \u51901  \u45149  \u45796 \u51020  \u50948 \u52824  \} while(position <= n)\{ // \u45149 \u44284  \u44592 \u51316  \u47560 \u51648 \u47561  \u44592 \u51648 \u44397  \u49324 \u51060 \u50640  \u44277 \u44036  \u51080 \u45716  \u44221 \u50864  position += 2 * w + 1; answer++; \} return answer; \} \}}