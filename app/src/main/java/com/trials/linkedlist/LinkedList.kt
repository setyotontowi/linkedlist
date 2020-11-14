package com.trials.linkedlist

class LinkedList{
    var head: Node? = null
    var tail: Node? = null
    var length: Int = 0

    inner class Node(var value: Any?){
        var next: Node? = null
    }

    /*Add a node before the first element of linked list*/
    fun addAtHead(value: Any?){
        val h = this.head
        val newNode = Node(value)
        newNode.next = this.head
        head = newNode
        if (h == null) tail = newNode
        this.length++
    }

    /*Add a node after the first element of linked list*/
    fun addAtTail(value: Any?){
        var h = head
        val newNode = Node(value)
        newNode.next = null
        while (h!!.next != null) h = h.next
        h.next = newNode
        tail = newNode
        this.length++
    }

    /*Add a node in index-th node in the linked list*/
    fun addAtIndex(index: Int, value: Any?){
        var h = head
        var newNode = Node(value)
        var counter = 0
        if (index<0 || index>this.length) return
        if (index == 0){
            addAtHead(value)
            return
        }
        if (index == this.length){
            addAtTail(value)
        }
        while (counter != index - 1){
            h = h!!.next
            counter++
        }
        newNode.next = h!!.next
        h.next = newNode
        this.length++
    }

    /*Delete the index-th node in the linked list, if the index is valid*/
    fun deleteAtIndex(index: Int){
        var curr = this.head
        var prev:Node? = null
        var counter = 0
        if (index < 0 || index > this.length) return
        if (index == 0){
            head = curr!!.next
            this.length--
            return
        }
        while (counter != index){
            prev = curr
            curr = prev!!.next
            counter++
        }
        prev!!.next = curr!!.next
        if (index == length-1) tail = prev
        this.length--
    }

    /*Get the value of the index-th node in the linked list. If the index is invalid return -1*/
    fun get(index: Int): Any?{
        var h = head
        var counter = 0
        if (index < 0 || index > this.length) return -1
        while (counter != index){
            h = h!!.next
            counter++
        }
        return h!!.value
    }

    /*TODO: Review and Reflection
    * - How Node() can store any value without saving it to variable? [syntax] @19.01
    * - Try to create own LinkedList algorithm. Understanding scale (2/5) [algorithm] @19.01
    * */
}