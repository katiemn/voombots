# Voombots
Voombots Coding Assignment

## Solution Outline:

* **Takes a String input that structured with line breaks
* **The first line is the upper-right coordinates of the room
* **Each bot then has two lines
  - The first line of the two is the bot's starting coordinates
  - The second is the series of instructions that the bot follows
* **A String array is used to store each line of the input
* **The max coordinates of the room are obtained from the beginning of the array and stored as integers 
* **An empty string is created to store future outputs
* **A for loop is created to iterate through each bot's location and instructions 
  - The location and instructions are both stored in strings and trimmed to eliminate spaces at the beginning and end
  - The starting coordinates are stored as integers and checked to ensure that they are within the established grid
* **Another for loop iterates through each separate instruction for that bot
  - If the instruction is Left or Right: the direction changes based on where it is currently facing
  - If the instruction is Middle: the bot moves and along either the x or y axis depending on what direction it is currently facing
* **Once completed, each bot's output is stored in the results string
* **Result string is returned once all bots have been moved
