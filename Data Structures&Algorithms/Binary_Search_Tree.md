
# Binary Search Tree

[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamaları:

1- root 7'dir.

2- 5, 7'den küçük olduğu için sola geçer.

            7
           /
          5

3- 1 7'den ve 5'ten küçük olduğu için 5'in soluna geçer. 

            7
           /
          5
         /
       1

4- 8 7'den büyük olduğu için 7'nin sağına geçer. 

            7
           / \
          5   8
         /
       1       

5- 3 7 ve 5'ten küçük 1'den büyük olduğu için 1'nin sağına geçer. 

            7
           / \
          5   8
         /
       1    
        \
         3 

6- 6 7'denküçük 5'ten büyük olduğu için 5'in sağına geçer. 

            7
           / \
          5   8
         / \
       1     6
        \
         3 
7- 0 7, 5 ve 1'den küçük olduğu için 1'in soluna geçer. 

             7
            / \
           5   8
          / \
        1     6
      /  \
     0   3

8- 8 7 ve 8'den büyük olduğu için 8'in sağına geçer. 

             7
            / \
           5   8
          / \   \
        1     6  9
      /  \
     0   3

9- 4 7 ve 5'ten küçük 1 ve 3'ten büyük olduğu için 3'ün sağına geçer. 

             7
            / \
           5   8
          / \   \
        1     6  9
      /  \
     0    3
            \
             4

10- 2 7 ve 5'ten küçük 1'den büyük ve 3'ten küçük olduğu için 3'ün soluna geçer. 

             7
            / \
           5   8
          / \   \
        1     6  9
      /  \
     0    3
         /  \
        2    4