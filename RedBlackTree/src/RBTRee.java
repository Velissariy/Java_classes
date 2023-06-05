public class RBTRee {


        private static final boolean RED = true;
        private static final boolean BLACK = false;


        private class Node {
            int key;
            int value;
            Node left, right;
            boolean color;

            Node(int key, int value, boolean color) {
                this.key = key;
                this.value = value;
                this.color = color;
            }
        }

        private Node root;

        private boolean isRed (Node x){
            if (x == null) return false;
            return x.color == RED;
        }

        private Node rotateLeft (Node h){
            Node x = h.right;
            h.right = x.left;
            x.left = h;
            x.color = h.color;
            h.color = RED;
            return x;
        }

        private Node rotateRight (Node h){
            Node x = h.left;
            h.left = x.right;
            x.right = h;
            x.color = h.color;
            h.color = RED;
            return x;
        }

        private void flipColors (Node h){
            h.color = RED;
            h.left.color = BLACK;
            h.right.color = BLACK;
        }

        public void put ( int key, int value){
            root = put(root, key, value);
            root.color = BLACK;
        }

        private Node put (Node h,int key, int value){
            if (h == null) return new Node(key, value, RED);
            if (key < h.key) h.left = put(h.left, key, value);
            else if (key > h.key) h.right = put(h.right, key, value);
            else h.value = value;

            if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h);
            if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h);
            if (isRed(h.left) && isRed(h.right)) flipColors(h);

            return h;
        }
    }

//    RBTRee tree = new RBTRee();
//
//    tree.put(1, 10);
//    tree.put(2, 20);
//    tree.put(3, 30);
//    tree.put(4, 40);
//    tree.put(5, 50);
//
//    // Вывод дерева в консоль
//        System.out.println(tree.root.key); // 2
//        System.out.println(tree.root.left.key); // 1
//        System.out.println(tree.root.right.key); // 4
//        System.out.println(tree.root.right.left.key); // 3
//        System.out.println(tree.root.right.right.key); // 5