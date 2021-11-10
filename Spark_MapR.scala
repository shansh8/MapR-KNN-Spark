//Company tax problem

val compRDD= sc.texFile("file1.txt")
val indRDD= sc.textFile("file2.txt")

val newcomprdd=compRDD.map(t=> { var new= t.split(" ");
		  (new(0),new(1)})
val newindrdd=indRDD.map(t1=> { var new1= t1.split(" ");
		  (new1(0),new1(1)})

val SumSalComp=newcomprdd.reduceByKey((e1,e2)=>(e1+e2))

val jointrdd=SumSalComp.join(newindrdd)

val final=jointrdd.filter(t2=> t2.2!=t2.3)


//KNN with SPARK

Step_1-- val traindata= sc.textFile()

Step_2-- val testsample= read()

imp-- if problem can be divided into subproblems it can be solved by mapR

Step_3-- val trainRDD= traindata.map(t=> var k= t.split(" "); (v,c); sim=computesim(v,testsample); (sim,c)})

Step_4-- val knnRDD= trainRDD.Top(k)

Step_5-- ReduceByClass.

Step_6-- Take out class with high number.

