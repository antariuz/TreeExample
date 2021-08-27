package model;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @org.junit.jupiter.api.Test
    void wideSearch() {
        Tree root =
                new Tree(-1,
                        new Tree(666, null, null),
                        new Tree(2+2, null, new Tree(69)));
        assertTrue(Tree.wideSearch(root,4));



    }
}