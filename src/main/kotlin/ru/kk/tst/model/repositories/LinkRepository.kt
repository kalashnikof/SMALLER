package ru.kk.tst.model.repositories

import org.springframework.data.repository.Repository
import ru.kk.tst.model.Link
import java.util.*

/**
 * Created by Kirill on 21.01.2017.
 */
interface LinkRepository : Repository<Link, Long> {
    fun findOne(id: Long?): Optional<Link>
    fun save(link: Link): Link
    fun findAll(): List<Link>
}