Scala Taxman AI
===============

A brute force solver for the Taxman game (https://bitbucket.org/richardward/scala-taxman-ai)

My first attempt at a Scala.

Runs out of memory with a game size of 25!

Sample output:

    Finding an optimal solution for 1...
    0
    Queue()
    Took 0.001 seconds
    Finding an optimal solution for 2...
    2
    Queue(2)
    Took 0.0 seconds
    Finding an optimal solution for 3...
    3
    Queue(3)
    Took 0.0 seconds
    Finding an optimal solution for 4...
    7
    Queue(3, 4)
    Took 0.0 seconds
    Finding an optimal solution for 5...
    9
    Queue(5, 4)
    Took 0.002 seconds
    Finding an optimal solution for 6...
    15
    Queue(5, 4, 6)
    Took 0.008 seconds
    Finding an optimal solution for 7...
    17
    Queue(7, 4, 6)
    Took 0.002 seconds
    Finding an optimal solution for 8...
    21
    Queue(7, 6, 8)
    Took 0.004 seconds
    Finding an optimal solution for 9...
    30
    Queue(7, 9, 6, 8)
    Took 0.007 seconds
    Finding an optimal solution for 10...
    40
    Queue(7, 9, 6, 10, 8)
    Took 0.014 seconds
    Finding an optimal solution for 11...
    44
    Queue(11, 9, 6, 10, 8)
    Took 0.013 seconds
    Finding an optimal solution for 12...
    50
    Queue(11, 9, 10, 8, 12)
    Took 0.018 seconds
    Finding an optimal solution for 13...
    52
    Queue(13, 8, 9, 12, 10)
    Took 0.013 seconds
    Finding an optimal solution for 14...
    66
    Queue(13, 14, 9, 8, 12, 10)
    Took 0.044 seconds
    Finding an optimal solution for 15...
    81
    Queue(13, 9, 15, 10, 8, 14, 12)
    Took 0.074 seconds
    Finding an optimal solution for 16...
    89
    Queue(13, 9, 15, 10, 12, 14, 16)
    Took 0.134 seconds
    Finding an optimal solution for 17...
    93
    Queue(17, 9, 15, 10, 16, 12, 14)
    Took 0.119 seconds
    Finding an optimal solution for 18...
    111
    Queue(17, 9, 15, 10, 18, 14, 12, 16)
    Took 0.301 seconds
    Finding an optimal solution for 19...
    113
    Queue(19, 9, 15, 10, 18, 12, 16, 14)
    Took 0.412 seconds
    Finding an optimal solution for 20...
    124
    Queue(19, 10, 20, 14, 16, 15, 12, 18)
    Took 1.054 seconds
    Finding an optimal solution for 21...
    144
    Queue(19, 9, 21, 15, 14, 18, 12, 20, 16)
    Took 2.13 seconds
    Finding an optimal solution for 22...
    166
    Queue(19, 9, 21, 14, 18, 12, 22, 15, 16, 20)
    Took 14.731 seconds
    Finding an optimal solution for 23...
    170
    Queue(23, 9, 21, 14, 18, 22, 12, 15, 16, 20)
    Took 18.998 seconds
