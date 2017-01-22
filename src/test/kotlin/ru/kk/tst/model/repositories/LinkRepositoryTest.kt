package ru.kk.tst.model.repositories

import com.github.springtestdbunit.annotation.DatabaseOperation
import com.github.springtestdbunit.annotation.DatabaseSetup
import com.github.springtestdbunit.annotation.DatabaseTearDown
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import ru.kk.tst.model.AbstractRepositoryTest
import java.util.*
import org.hamcrest.Matchers.*
import org.hamcrest.MatcherAssert.assertThat
import ru.kk.tst.model.Link

/**
 * Created by Kirill on 21.01.2017.
 */
@DatabaseSetup(LinkRepositoryTest.DATASET)
@DatabaseTearDown(type = DatabaseOperation.DELETE_ALL, value = LinkRepositoryTest.DATASET)
open class LinkRepositoryTest : AbstractRepositoryTest() {

    @Autowired
    lateinit var repository: LinkRepository

    @Test
    fun findOneExisting() {
        val got: Optional<Link> = repository.findOne(LINK_1_ID)
        assertThat(got.isPresent, equalTo(true))
        val link = got.get()
        assertThat(link, equalTo(Link(LINK_1_TEXT, LINK_1_ID)))
    }

    @Test
    fun findOneNotExisting() {
        val got: Optional<Link> = repository.findOne(LINK_NOT_FOUND)
        assertThat(got.isPresent, equalTo(false))
    }

    @Test
    fun saveNew() {
        val toBeSaved: Link = Link(LINK_TBS_TEXT)
        val got: Link = repository.save(toBeSaved)
        val list: List<Link> = repository.findAll()

        assertThat(list, hasSize((4)))
        assertThat(got.text, equalTo(LINK_TBS_TEXT))
    }

    companion object {
        const val DATASET = "classpath:datasets/link-table.xml"
        private val LINK_1_ID: Long = 100500
        private val LINK_1_TEXT: String = "https://angularjs.org"
        private val LINK_TBS_TEXT: String = "https://docs.angularjs.org/examples/example-checkbox-input-directive"
        private val LINK_NOT_FOUND: Long = 1L
    }
}