package br.com.facomgram.doublyLinkedList

class DoublyLinkedList {
    var head: Node? = null
    var tail: Node? = null
    var size: Int = 0

    fun add(value: Int) {
        if (head == null) {
            addFirst(value)
        } else {
            tail = addAt(size, value)
        }
    }

    fun addFirst(value: Int): Node {
        val newHead: Node?
        size ++

        if (head == null) {
            head = Node(value)
            return head!!
        } else {
            newHead = Node(data = value, next = head!!)
            head!!.prev = newHead
            head = newHead
            if (tail == null) {
                tail = head!!.next
            }
        }
        return newHead
    }

    fun removeFirst() {
        if (head == null) throw NullPointerException("Cannot remove a empty head")
        head = head!!.next!!

        size --
    }

    fun addLast(value: Int): Node {
        val newTail = Node(data = value, prev = tail, next = null)
        tail?.next = newTail
        tail = newTail

        size ++
        return newTail
    }

    fun removeLast() {
        if (tail == null) throw NullPointerException("Cannot remove a empty tail")
        tail = tail?.prev
        tail?.next = null
        size --
    }

    fun addAt(position: Int, value: Int): Node {
        val newNode = Node(data = value)
        if(position > size){
            addLast(value)
        } else {
            var aux = head
            try {
                for (i in 0..position - 2) {
                    aux = aux?.next
                }
                val auxNext = aux?.next
                newNode.prev = aux
                newNode.next = aux?.next
                aux?.next = newNode
                auxNext?.prev = newNode

            } catch (e: Exception) {
                addLast(value)
            }
        }
        size ++
        return newNode
    }

    fun removeAt(position: Int) {
        if (position > size) {
            throw NullPointerException("Given position are not in the list")
        } else {
            var aux = head
            for (i in 0.. position - 2) {
                aux = aux?.next
            }
            val elementToRemove = aux?.next
            val nextToRemoved = elementToRemove!!.next
            aux?.next = nextToRemoved
            if (nextToRemoved != null) {
                nextToRemoved.prev = aux
            }
        }
        size --
    }

    fun peekFirst(): Int {
        if (head == null) throw RuntimeException("Empty list")
        return head!!.data
    }

    fun peekLast(): Int {
        if (tail == null) throw RuntimeException("Empty list")
        return tail!!.data
    }

    fun peekAt(position: Int): Int {
        if (position > size) {
            throw NullPointerException("Given position are not in the list")
        } else {
            var aux = head
            for (i in 0..< position) {
                aux = aux?.next
            }
            return aux!!.data
        }
    }

    override fun toString(): String {
        var aux = head
        var result = ""
        while (aux != null) {
            result += "${aux.data} <-> "
            aux = aux.next
        }
        return result
    }

}