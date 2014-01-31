import static org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.Before
@Grab(group="junit",module="junit",version="4.11")
class testJsonCreator{
	def jSonCreator
	def listOfTodoObj = []
	def todoObj
	@Before
	void setUp(){
		jSonCreator = new JsonCreator()
		todoObj = new Todo(1,"fly a kite")
		listOfTodoObj.add(todoObj)
	}
	@Test
	void testCreateJson(){
		
		def expectedResult = '{"todo":{"id":"1","entry":"fly a kite"}}'
		println jSonCreator.createJson(listOfTodoObj)
		
		def actualResult = jSonCreator.createJson(listOfTodoObj)

		assert actualResult==expectedResult
	}
}
