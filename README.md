# FlyWeight
A basic implementation of FlyWeight Design Pattern using FiveArmies Battle scenario

Description
===========
The project gives a demo implementation for the FlyWeight design pattern.     
The Character interface provides the extrinsic operation for both the Shared and UnShared Characters.    
The BattleGround class is the FlyWeightFactory and manages creation of new characters. If the character already exists, it returns the existing character.    
SharedCharacter and UnSharedCharacter classes implement the Character interface thereby providing an implementation to the extrinsic operations.    
SharedCharacter contains instance of Intrinsic and Extrinsic States.    
The UnSharedCharacter contains only extrinsic state and any additional operations it may have.
  
Notes
=====
Thus Design pattern is applicable only when the army is created in thousands.    
But, for demonstration purpose only 2 Orcs, 2 Archers and 1 Army Chief have been created.    
To understand the full effectiveness of the design pattern, create 10,000 Orcs and 10,000 Archers.    
  
Maintenance History
===================
Nov 6th: Documentation and Code beautification.    
Oct 3rd: Overloaded toString() method to show the shared classes use the same object.    
Oct 2nd: Skeleton Code.    
  
How to Run this project
=======================
Run the FiveArmies.java file. It will give you a demo output.    
  
Understanding the Output
========================
There can be only one ArmyChief. Hence, the output contains only one instance of the Character. ArmyChief represents UnSharedCharacter.    
There can be multiple SharedCharacters like Orcs, Archers.    
Each of Orcs share common characters like strength and height. They share the same object and hence the same Object HashCode for the intrinsic state of all the Orcs.    
Each Orc has a different extrinsic state and hence different values for position, health and object HashCode.
Same applies to the Archers.    

File Details
============
@author Pramukh    
@version 1.3     
@website github.com/prmk    
@email pramukhshenoy@gmail.com    
