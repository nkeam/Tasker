import java.util.regex.Matcher

class TextParser{
	def parseFile(file){
		def regex = /(\d+)\.\s(.*)/
		def todoObjList = []
		file.eachLine{ line ->
			def matcher = line =~ regex
			matcher.each{ wholeMatch, id, entry ->
				def todo = new Todo(id.toInteger(),entry.toString())
				todoObjList.add(todo)
			}
		}
		return todoObjList
	}
}