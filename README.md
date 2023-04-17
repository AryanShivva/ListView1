# ToDoList-App 

Usage : Made using Listview and Adapter Concept.

LISTVIEW : Android ListView is a ViewGroup which is used to display the list of items in multiple rows and contains an adapter which automatically inserts the items into the list.
The main purpose of the adapter is to fetch data from an array or database and insert each item that placed into the list for the desired result. So, it is main source to pull data from strings.xml file which contains all the required strings in Kotlin or xml files.

ADAPTER : Adapter holds the data fetched from an array and iterates through each item in data set and generates the respective views for each item of the list. So, we can say it act as an intermediate between the data sources and adapter views such as ListView, Gridview.
          Different Types of Adapter –

ArrayAdapter: It always accepts an Array or List as input. We can store the list items in the strings.xml file also.

CursorAdapter: It always accepts an instance of cursor as an input means

SimpleAdapter: It mainly accepts a static data defined in the resources like array or database.

BaseAdapter: It is a generic implementation for all three adapter types and it can be used in the views according to our requirements.


    class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView) //finding

        val tasklist = arrayListOf<String>()  //creating an array
        tasklist.add("Attend Exam")
        tasklist.add("Complete the project")
        tasklist.add("Improve internet presence")
        tasklist.add("Shop items from market")
        tasklist.add("Work on Resume")
        tasklist.add("Complete Assignment ")

        //craeting adapter//the below line decides the apperance of the listview
        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1,tasklist)
        listView.adapter = adapterForMyListView
        //assigning the adapter.//setting the adapter.


        //action performing when we click on each item in the list
        listView.setOnItemClickListener{ parent, view, position, id ->
            val text = "Clicked on item : " + (view as TextView).text //t
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }



        }
    }
