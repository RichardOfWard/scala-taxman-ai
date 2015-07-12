Scala Taxman AI
===============

A brute force solver for the Taxman game (https://bitbucket.org/richardward/scala-taxman-ai)

My first attempt at a Scala.

Sample output:

    Finding an optimal solution for 1...
    0
    Queue()
    Took 0.137 seconds
    Finding an optimal solution for 2...
    2
    Queue(2)
    Took 0.029 seconds
    Finding an optimal solution for 3...
    3
    Queue(3)
    Took 0.029 seconds
    Finding an optimal solution for 4...
    7
    Queue(3, 4)
    Took 0.003 seconds
    Finding an optimal solution for 5...
    9
    Queue(5, 4)
    Took 0.004 seconds
    Finding an optimal solution for 6...
    15
    Queue(5, 4, 6)
    Took 0.007 seconds
    Finding an optimal solution for 7...
    17
    Queue(7, 4, 6)
    Took 0.008 seconds
    Finding an optimal solution for 8...
    21
    Queue(7, 8, 6)
    Took 0.009 seconds
    Finding an optimal solution for 9...
    30
    Queue(7, 9, 6, 8)
    Took 0.013 seconds
    Finding an optimal solution for 10...
    40
    Queue(7, 9, 6, 8, 10)
    Took 0.024 seconds
    Finding an optimal solution for 11...
    44
    Queue(11, 9, 6, 8, 10)
    Took 0.025 seconds
    Finding an optimal solution for 12...
    50
    Queue(11, 9, 10, 8, 12)
    Took 0.043 seconds
    Finding an optimal solution for 13...
    52
    Queue(13, 9, 8, 12, 10)
    Took 0.037 seconds
    Finding an optimal solution for 14...
    66
    Queue(13, 8, 9, 12, 14, 10)
    Took 0.107 seconds
    Finding an optimal solution for 15...
    81
    Queue(13, 9, 15, 10, 8, 14, 12)
    Took 0.112 seconds
    Finding an optimal solution for 16...
    89
    Queue(13, 9, 15, 10, 16, 14, 12)
    Took 0.197 seconds
    Finding an optimal solution for 17...
    93
    Queue(17, 9, 15, 10, 16, 14, 12)
    Took 0.134 seconds
    Finding an optimal solution for 18...
    111
    Queue(17, 9, 15, 10, 18, 12, 14, 16)
    Took 0.168 seconds
    Finding an optimal solution for 19...
    113
    Queue(19, 9, 15, 10, 14, 18, 12, 16)
    Took 0.117 seconds
    Finding an optimal solution for 20...
    124
    Queue(19, 10, 20, 16, 14, 15, 12, 18)
    Took 0.301 seconds
    Finding an optimal solution for 21...
    144
    Queue(19, 9, 15, 21, 14, 18, 12, 16, 20)
    Took 0.693 seconds
    Finding an optimal solution for 22...
    166
    Queue(19, 9, 15, 21, 14, 18, 12, 22, 20, 16)
    Took 2.963 seconds
    Finding an optimal solution for 23...
    170
    Queue(23, 9, 21, 15, 14, 18, 12, 16, 22, 20)
    Took 3.294 seconds
    Finding an optimal solution for 24...
    182
    Queue(23, 9, 21, 15, 14, 22, 20, 18, 16, 24)
    Took 7.821 seconds
    Finding an optimal solution for 25...
    198
    Queue(23, 25, 15, 21, 14, 18, 16, 22, 20, 24)
    Took 20.459 seconds
    Finding an optimal solution for 26...
    224
    Queue(23, 25, 15, 21, 14, 16, 26, 22, 20, 18, 24)
    Took 146.154 seconds
