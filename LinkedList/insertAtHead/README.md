# Insert at Head in a Singly Linked List

## Problem Statement

Given the head of a singly linked list and an integer `data`, insert a new node containing `data` at the **beginning** of the linked list and return the new head.

## Example

### Input

```
Linked List: 10 → 20 → 30
Data: 5
```

### Output

```
5 → 10 → 20 → 30
```

---

## Approach

1. Create a new node with the given data.
2. If the linked list is empty, make the new node the head.
3. Otherwise, point the new node's `next` to the current head.
4. Update the head to the new node.
5. Return the updated head.

---

## Algorithm

```
Create a new node.
If head is null:
    Return the new node.
Else:
    newNode.next = head
    head = newNode
Return head.
```

---

## Time Complexity

- **O(1)** – The insertion is performed in constant time.

## Space Complexity

- **O(1)** – Only one new node is created.

---

## Java Solution

```java
class Solution {
    public ListNode insertAtHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head = newNode;

        return head;
    }
}
```

---

## Key Concepts

- Singly Linked List
- Head Pointer
- Node Creation
- Reference Manipulation
- Constant Time Insertion

---

## Learning Outcome

This problem helps understand:

- How nodes are connected using references.
- Why the head pointer must be updated after inserting at the beginning.
- How insertion at the head of a linked list takes **O(1)** time.
