{\rtf1\ansi\ansicpg949\cocoartf2708
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fmodern\fcharset0 Courier;\f1\fmodern\fcharset0 Courier-Oblique;\f2\fnil\fcharset0 Menlo-Italic;
}
{\colortbl;\red255\green255\blue255;\red0\green29\blue164;\red9\green9\blue9;\red10\green79\blue103;
\red114\green0\blue130;\red121\green121\blue121;\red18\green51\blue230;\red17\green109\blue18;}
{\*\expandedcolortbl;;\csgenericrgb\c0\c11373\c64314;\csgenericrgb\c3529\c3529\c3529;\csgenericrgb\c3922\c30980\c40392;
\csgenericrgb\c44706\c0\c50980;\csgenericrgb\c47451\c47451\c47451;\csgenericrgb\c7059\c20000\c90196;\csgenericrgb\c6667\c42745\c7059;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs30 \cf2 package \cf0 implementation\cf3 ;\
\
\cf2 import \cf0 java.io.BufferedReader\cf3 ;\
\cf2 import \cf0 java.io.IOException\cf3 ;\
\cf2 import \cf0 java.io.InputStreamReader\cf3 ;\
\cf2 import \cf0 java.util.StringTokenizer\cf3 ;\
\
\cf2 public class \cf0 n16967 \cf3 \{\
    \cf2 public static void \cf4 main\cf3 (\cf0 String\cf3 [] args) \cf2 throws \cf0 IOException \cf3 \{\
        \cf0 BufferedReader br \cf3 = \cf2 new \cf3 BufferedReader(\cf2 new \cf3 InputStreamReader(\cf0 System\cf3 .
\f1\i \cf5 in
\f0\i0 \cf3 ));\
        \cf0 StringTokenizer \cf3 st = \cf2 new \cf3 StringTokenizer(\cf0 br\cf3 .readLine());\
\
        \cf2 int \cf0 H \cf3 = \cf0 Integer\cf3 .
\f1\i parseInt
\f0\i0 (st.nextToken());\
        \cf2 int \cf0 W \cf3 = \cf0 Integer\cf3 .
\f1\i parseInt
\f0\i0 (st.nextToken());\
        \cf2 int \cf0 X \cf3 = \cf0 Integer\cf3 .
\f1\i parseInt
\f0\i0 (st.nextToken());\
        \cf2 int \cf0 Y \cf3 = \cf0 Integer\cf3 .
\f1\i parseInt
\f0\i0 (st.nextToken());\
\
        \cf2 int\cf3 [][] \cf0 A \cf3 = \cf2 new int\cf3 [\cf0 H\cf3 ][\cf0 W\cf3 ];\
        \cf2 int\cf3 [][] \cf0 B \cf3 = \cf2 new int\cf3 [\cf0 H\cf3 +\cf0 X\cf3 ][\cf0 W\cf3 +\cf0 Y\cf3 ];\
\
        
\f1\i \cf6 // 
\f2 \uc0\u51077 \u47141 \u48155 \u44592 \
        
\f0\i0 \cf2 for\cf3 (\cf2 int \cf3 i = \cf7 0\cf3 ; i < \cf0 B\cf3 .\cf5 length\cf3 ; i++)\{\
            st = \cf2 new \cf3 StringTokenizer(\cf0 br\cf3 .readLine());\
            \cf2 for\cf3 (\cf2 int \cf3 j = \cf7 0\cf3 ; j < \cf0 B\cf3 [\cf7 0\cf3 ].\cf5 length\cf3 ; j++)\{\
                \cf0 B\cf3 [i][j] = \cf0 Integer\cf3 .
\f1\i parseInt
\f0\i0 (st.nextToken());\
            \}\
        \}\
\
        
\f1\i \cf6 // 
\f2 \uc0\u44217 \u52824 \u45716  \u48512 \u48516  \u54633 \u54620  \u44050 \u50640 \u49436  \u48764 \u51452 \u44592 \
        
\f0\i0 \cf2 for\cf3 (\cf2 int \cf3 i = \cf7 0\cf3 ; i < \cf0 H\cf3 ; i++)\{\
            \cf2 for\cf3 (\cf2 int \cf3 j = \cf7 0\cf3 ; j < \cf0 W\cf3 ; j++)\{\
                \cf2 if\cf3 (i - \cf0 X \cf3 >= \cf7 0 \cf3 && j - \cf0 Y \cf3 >= \cf7 0\cf3 )\{\
                    \cf0 A\cf3 [i][j] = \cf0 B\cf3 [i][j] - \cf0 A\cf3 [i-\cf0 X\cf3 ][j-\cf0 Y\cf3 ];\
                \}\cf2 else\cf3 \{\
                    \cf0 A\cf3 [i][j] = \cf0 B\cf3 [i][j];\
                \}\
            \}\
        \}\
\
        
\f1\i \cf6 // 
\f2 \uc0\u52636 \u47141 \
        
\f0\i0 \cf2 for\cf3 (\cf2 int \cf3 i = \cf7 0\cf3 ; i < \cf0 H\cf3 ; i++)\{\
            \cf2 for\cf3 (\cf2 int \cf3 j = \cf7 0\cf3 ; j < \cf0 W\cf3 ; j++)\{\
                \cf0 System\cf3 .
\f1\i \cf5 out
\f0\i0 \cf3 .print(\cf0 A\cf3 [i][j] + \cf8 " "\cf3 );\
            \}\
            \cf0 System\cf3 .
\f1\i \cf5 out
\f0\i0 \cf3 .println();\
        \}\
    \}\
\}\
\
}