   /   *      
       *       T   o       c   h   a   n   g   e       t   h   i   s       t   e   m   p   l   a   t   e   ,       c   h   o   o   s   e       T   o   o   l   s       |       T   e   m   p   l   a   t   e   s      
       *       a   n   d       o   p   e   n       t   h   e       t   e   m   p   l   a   t   e       i   n       t   h   e       e   d   i   t   o   r   .      
       *   /      
   p   a   c   k   a   g   e       l   a   b   2   ;      
      
   i   m   p   o   r   t       j   a   v   a   .   i   o   .   F   i   l   e   ;      
   i   m   p   o   r   t       j   a   v   a   .   i   o   .   F   i   l   e   I   n   p   u   t   S   t   r   e   a   m   ;      
   i   m   p   o   r   t       j   a   v   a   .   i   o   .   F   i   l   e   N   o   t   F   o   u   n   d   E   x   c   e   p   t   i   o   n   ;      
   i   m   p   o   r   t       j   a   v   a   .   i   o   .   I   O   E   x   c   e   p   t   i   o   n   ;      
   i   m   p   o   r   t       j   a   v   a   .   i   o   .   I   n   p   u   t   S   t   r   e   a   m   ;      
      
   /   *   *      
       *      
       *       @   a   u   t   h   o   r       D   e   n   G      
       *   /      
   p   u   b   l   i   c       c   l   a   s   s       C   r   y   p   t   o   K   e   y       {      
                   p   r   i   v   a   t   e       b   y   t   e   [   ]       k   e   y   ;      
                   p   r   i   v   a   t   e       i   n   t       i   t   e   r   a   t   o   r   ;      
                   p   u   b   l   i   c       C   r   y   p   t   o   K   e   y   (   S   t   r   i   n   g       k   e   y   )   {      
                                   t   h   i   s   .   k   e   y       =       k   e   y   .   g   e   t   B   y   t   e   s   (   )   ;      
                   }      
                   p   u   b   l   i   c       C   r   y   p   t   o   K   e   y   (   F   i   l   e       f   i   l   e   )       t   h   r   o   w   s       F   i   l   e   N   o   t   F   o   u   n   d   E   x   c   e   p   t   i   o   n   ,       I   O   E   x   c   e   p   t   i   o   n   {      
                                   I   n   p   u   t   S   t   r   e   a   m       i   n       =       n   e   w       F   i   l   e   I   n   p   u   t   S   t   r   e   a   m   (   f   i   l   e   )   ;      
                                   b   y   t   e   [   ]       b   y   t   e   s       =       n   e   w       b   y   t   e   [   (   i   n   t   )   f   i   l   e   .   l   e   n   g   t   h   (   )   ]   ;      
                                   i   n   .   r   e   a   d   (   b   y   t   e   s   )   ;      
                                   i   n   .   c   l   o   s   e   (   )   ;      
                                   S   y   s   t   e   m   .   o   u   t   .   p   r   i   n   t   l   n   (   "    ;  N  G      7  0  3  @  C  6  5  =   .   "   )   ;      
                                   t   h   i   s   .   k   e   y       =       b   y   t   e   s   ;      
                   }      
                   p   u   b   l   i   c       b   y   t   e       g   e   t   N   e   x   t   B   y   t   e   (   )       {      
                                   i   f   (   i   t   e   r   a   t   o   r       =   =       k   e   y   .   l   e   n   g   t   h   )       i   t   e   r   a   t   o   r       =       0   ;      
                                   r   e   t   u   r   n       k   e   y   [   i   t   e   r   a   t   o   r   +   +   ]   ;      
                   }      
                      
                      
   }      
