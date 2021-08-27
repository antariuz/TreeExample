import model.Tree;

public class TreeExample {
    public static void main(String[] args) {
        Tree root =
                new Tree(1,
                        new Tree(2,
                                new Tree(3, null, new Tree(4)), new Tree(5)),
                        new Tree(6,
                                new Tree(7, new Tree(8), null),
                                new Tree(9, new Tree(10), new Tree(11))));
        int num = 12;
        System.out.println("Does the Tree has " + num + "? - " + Tree.wideSearch(root, num));
    }
}
