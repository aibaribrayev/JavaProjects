Implement the classes required for a simple single-player game.
The game comprises a player, a number of enemies, a number of items, and a number of rooms.
Rooms can contain a player, a number of enemies, and a number of items.
The relative locations of rooms are set when a map is generated.

The following game rules apply:
• Weapon, Armor, Poison, HealthPotion classes should have this:
o Each of the class have correspondingly one of the powers: Weapon has attack Power, Armor has Defense Power, Poison has Destroy Power and
HealthPotion has Healing Power.
o to String methods for printing the type of Item and its power.
• Inventory should have this:
o For storing more than one Item, create some collection for Items,
o Since Inventory is possessed by the Room and Actor, where the types and
number of items could be different you can create a method which generates and adds those items to the list of items in this class using the Random generator. You can even create several methods for that.
• Room class should have this:
o For storing more than one Actor, you need to have some collection for
Actors,
o For storing inventory, one instance of inventory that will be passed to
constructor should be enough. Since the inventory has own list of different
Items.
o toString method for printing inventory and all actors which were located in
that room.
• Actor class should have this:
o For storing inventory, one instance of inventory that will be passed to constructor should be enough. Since the inventory has own list of different Items.
• Enemy class should have this:
• Player class should have this:
• GameMap class should have this:
o Once the game has created the game Map with width
*height rooms should
be allocated first. (Hint: In the class GameMap you need to create a 2D array
of type Room); (This part probably done in Part 1).
o You might need a field for maximum number of enemies passed to
GameMap constructor, so that we could know what is the limit of enemies
that can be allocated to the GameMap.
o GameMap should have a method which goes through every room in the map
and adds random number of items and enemies to random rooms. Where room can have multiple items and enemies at the same time. This methods will be called by Game class later.
o GameMap should have a method which allocates a player of the game to some random room to start the game.
o GameMap should have a method to print every room with their containing items and actors. This methods will be called by Game class later.
• Game class should have this:
o Since the size of the GameMap can be resizable, you should have a constructor, which takes width, height, maximum number of enemies and the player itself. (You should extend the constructor of the Game class from Part 1.)
o In order to begin the game you will need a method, which allows to fill the GameMap with items, enemies and even player.
o As well as print this game map with all the rooms and the content of each room. (This method just does the method call from GameMap and done in Part 1).
• Inside the Main class:
o You need to have an instances of the Player and of the Game to begin the game with printing only the Game Map with all the rooms and their contained items.