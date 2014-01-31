import static org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.Before
@Grab(group="junit",module="junit",version="4.11")
class TextParserTest{
	def file 
	def textParser
	def todoObjList
	@Before
	void setUp(){
		textParser = new TextParser()
		todoObjList = []
		file = new File("C:/Dev/Projects/Groovy_Practice/tasker/test/resource/todo.txt")
	}
	@Test
	void testTextParser(){
		def expectedId = 1
		def expectedEntry = "feed missy"

		todoObjList = textParser.parseFile(file)
		
		def actualId = todoObjList[0].id
		def actualEntry = todoObjList[0].entry

		assert expectedId == actualId
		assert expectedEntry == actualEntry
	}
}
 