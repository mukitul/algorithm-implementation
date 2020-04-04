#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

struct Node
{
    int data;
    struct Node *left, *right;
};

typedef struct Node *node;

node root = NULL;

node createNode(int val)
{
    node tmp;
    tmp = (node)malloc(sizeof(struct Node));
    tmp->data = val;
    tmp->left = NULL;
    tmp->right = NULL;
    return tmp;
}

node insertNode(node root, int x)
{
    if (root == NULL)
        return createNode(x);
    if (root->data >= x)
    {
        root->left = insertNode(root->left, x);
    }
    else if (root->data < x)
    {
        root->right = insertNode(root->right, x);
    }

    return root;
}

void preOrderTraversal(node root)
{
    if (root == NULL)
        return;
    printf("%d ", root->data);
    preOrderTraversal(root->left);
    preOrderTraversal(root->right);
}

void insert(int val)
{
    root = insertNode(root, val);
}

int main()
{
    insert(5);
    insert(2);
    insert(10);
    insert(7);
    insert(1);
    insert(3);
    preOrderTraversal(root);
    return 0;
}
