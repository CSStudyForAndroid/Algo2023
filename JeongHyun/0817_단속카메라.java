{\rtf1\ansi\ansicpg949\cocoartf2708
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\partightenfactor0

\f0\fs24 \cf0 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import java.util.*; class Solution \{ public int solution(int[][] routes) \{ int answer = 1; Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1])); // \uc0\u45149 \u45208 \u45716  \u49692 \u51004 \u47196  \u50724 \u47492 \u52264 \u49692  \u51221 \u47148  int location = routes[0][1]; // \u52376 \u51020  \u50948 \u52824  for(int i = 1; i < routes.length; i++)\{ if(routes[i][0] > location)\{ answer++; location = routes[i][1]; \} \} return answer; \} \}}