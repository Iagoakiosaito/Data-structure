package br.com.facomgram.doublyLinkedList

fun usingDoublyLinkedList() {
    val linkedList = DoublyLinkedList()
    linkedList.add(-1)
    for (i in 0..5) linkedList.add(i)
    println("-----------------------------------")
    println("-----------------------------------")
    println("DUMP LINKED LIST:  $linkedList")
    println("tail: ${linkedList.tail!!.data}")
    println("-----------------------------------")
    println("-----------------------------------")

    println("Add first before ${linkedList.head!!.data}")
    linkedList.addFirst(1123)
    println("Add first after ${linkedList.head!!.data}")
    println("-----------------------------------")
    println("tail: ${linkedList.tail!!.data}")

    println("DUMP LINKED LIST:  $linkedList")

    println("-----------------------------------")

    println("Remove first before ${linkedList.head!!.data}")
    linkedList.removeFirst()
    println("Remove first after ${linkedList.head!!.data}")
    println("-----------------------------------")

    println("tail: ${linkedList.tail!!.data}")

    println("DUMP LINKED LIST:  $linkedList")

    println("-----------------------------------")

    println("Add last before ${linkedList.tail!!.data}")
    linkedList.addLast(1123)
    println("Add last after ${linkedList.tail!!.data}")
    println("-----------------------------------")

    println("DUMP LINKED LIST:  $linkedList")

    println("-----------------------------------")

    println("Remove last before ${linkedList.tail!!.data}")
    linkedList.removeLast()
    println("Remove last after ${linkedList.tail!!.data}")
    println("-----------------------------------")

    println("DUMP LINKED LIST:  $linkedList")

    println("-----------------------------------")


    println("Add at before $linkedList")
    linkedList.addAt(2, 1123)
    println("Add at after $linkedList")
    println("-----------------------------------")

    println("DUMP LINKED LIST:  $linkedList")

    println("-----------------------------------")

    println("Remove at before $linkedList")
    linkedList.removeAt(2)
    println("Remove at after $linkedList")
    println("-----------------------------------")

    println("DUMP LINKED LIST:  $linkedList")

    println("-----------------------------------")

    println("Get at before $linkedList")
    println("Get at after ${linkedList.peekAt(2)}")
    println("-----------------------------------")

    println("DUMP LINKED LIST:  $linkedList")

    println("-----------------------------------")

    println("Get first before $linkedList")
    println("Get first after ${linkedList.peekFirst()}")
    println("-----------------------------------")

    println("DUMP LINKED LIST:  $linkedList")

    println("-----------------------------------")

    println("Get last before $linkedList")
    println("Get last after ${linkedList.peekLast()}")
    println("-----------------------------------")
}