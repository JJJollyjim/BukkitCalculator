BukkitCalculator
================
_Calculate things, in Minecraft!_

Usage:
------

__`/calc` (or `/c`, `/calculate`) is the basic calculator command:__
* `/calc 5+1`: Returns 6
* `/calc (6-4)*90`: Returns 180

__`/stack` (or `/s`) provides useful calulations involving stacks of items:__
* `/stack 3`: Returns 192 (3 × 64)
* `/stack 3 43`: Returns 235 (3 × 64 + 43)
* `/stack 3 16 2`: Returns 50 (3 × 16 + 2). _Useful for snowballs, etc._

__The calculator can also be used inside chat messages with square brackets!__
* Chatting `I have [4*64+11] iron` changes to `I have 267 iron!`
* Chatting `I'm awesome! [or not]` is left alone.

Chat syntax is the same as the `/calc` command.

Supported Operators:
--------------------

* `-`: Subtract
* `+`: Add
* `*`: Multiply
* `/`: Divide
* `^`: Exponent
* `**`: Exponent
* `%`: Modulo
* `(`, `)`: Group part of a calculation
