package br.com.facomgram.doublyLinkedList

import lombok.AllArgsConstructor
import lombok.Data

@Data
@AllArgsConstructor
class Node(data: Int, next: Node?, prev: Node?) {

    constructor(data: Int) : this(data, null, null)
    constructor(data: Int, next: Node) : this(data, next, null)

    var data: Int = 0
    var next: Node? = null
    var prev: Node? = null

    init {
        this.data = data
        this.next = next
        this.prev = prev
    }
}