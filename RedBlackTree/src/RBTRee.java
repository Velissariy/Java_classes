public class RBTRee {
    public class RedBlackTree {
        private static final boolean RED = true, BLACK = false;

        private class Node {
            private int value;
            private Node left, right, parent;
            private boolean color;

            public Node(int value) {
                this.value = value;
                this.color = RED;
            }
        }

        private Node root;

        public void insert(int value) {
            root = insert(root, value);
            root.color = BLACK;
        }

        private Node insert(Node node, int value) {
            if (node == null) {
                return new Node(value);
            }

            if (value < node.value) {
                node.left = insert(node.left, value);
                node.left.parent = node;
            } else if (value > node.value) {
                {
                    node.right = insert(node.right, value);
                    node.right.parent = node;
                } else {
                    // Duplicates not allowed
                    return node;
                }

                if (isRed(node.right) && !isRed(node.left)) {
                    node = rotateLeft(node);
                }
                if (isRed(node.left) && isRed(node.left.left)) {
                    node = rotateRight(node);
                }
                if (isRed(node.left) && isRed(node.right)) {
                    flipColors(node);
                }

                return node;
            }

            private boolean isRed(Node x) {
                if (x == null) return false;
                return x.color == RED;
            }

            private Node rotateLeft(Node node) {
                Node temp = node.right;
                node.right = temp.left;
                if (temp.left != null) {
                    temp.left.parent = node;
                }
                temp.parent = node.parent;
                temp.left = node;
                node.parent = temp;
                temp.color = node.color;
                node.color = RED;
                return temp;
            }

            private Node rotateRight(Node node) {
                Node temp = node.left;
                node.left = temp.right;
                if (temp.right != null) {
                    temp.right.parent = node;
                }
                temp.parent = node.parent;
                temp.right = node;
                node.parent = temp;
                temp.color = node.color;
                node.color = RED;
                return temp;
            }

            private void flipColors(Node node) {
                node.color = RED;
                node.left.color = BLACK;
                node.right.color = BLACK;
            }
        }