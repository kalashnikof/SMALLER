package ru.kk.tst.model

import com.github.springtestdbunit.DbUnitTestExecutionListener
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests
import ru.kk.tst.TstApplication

/**
 * Created by Kirill on 21.01.2017.
 */
@TestPropertySource(locations = arrayOf("classpath:repositories-test.properties"))
@TestExecutionListeners(DbUnitTestExecutionListener::class)
@SpringBootTest // todo
//@SpringApplicationConfiguration(classes = arrayOf(TstApplication::class))
@DirtiesContext
abstract class AbstractRepositoryTest : AbstractTransactionalJUnit4SpringContextTests() {
}