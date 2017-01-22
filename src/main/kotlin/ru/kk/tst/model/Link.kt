package ru.kk.tst.model

import javax.persistence.*

/**
 * Created by Kirill on 21.01.2017.
 */
@Entity
@Table(name = "links")
data class Link(
        var text: String = "",
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "links_sequence")
        @SequenceGenerator(name = "links_sequence", sequenceName = "links_seq")
        var id: Long = 0
)