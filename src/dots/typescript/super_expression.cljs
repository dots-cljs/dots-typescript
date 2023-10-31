(ns dots.typescript.super-expression)

(defn kind
  ^js [super-expression]
  (.-kind ^js super-expression))

(defn flags
  ^js [super-expression]
  (.-flags ^js super-expression))

(defn parent
  ^js [super-expression]
  (.-parent ^js super-expression))

(defn source-file
  ^js [super-expression]
  (.getSourceFile ^js super-expression))

(defn child-count
  (^js [super-expression]
   (.getChildCount ^js super-expression))
  (^js [super-expression source-file]
   (.getChildCount ^js super-expression source-file)))

(defn child-at
  (^js [super-expression index]
   (.getChildAt ^js super-expression index))
  (^js [super-expression index source-file]
   (.getChildAt ^js super-expression index source-file)))

(defn children
  (^js [super-expression]
   (.getChildren ^js super-expression))
  (^js [super-expression source-file]
   (.getChildren ^js super-expression source-file)))

(defn start
  (^js [super-expression]
   (.getStart ^js super-expression))
  (^js [super-expression source-file]
   (.getStart ^js super-expression source-file))
  (^js [super-expression source-file include-js-doc-comment?]
   (.getStart ^js super-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [super-expression]
  (.getFullStart ^js super-expression))

(defn get-end
  ^js [super-expression]
  (.getEnd ^js super-expression))

(defn width
  (^js [super-expression]
   (.getWidth ^js super-expression))
  (^js [super-expression source-file]
   (.getWidth ^js super-expression source-file)))

(defn full-width
  ^js [super-expression]
  (.getFullWidth ^js super-expression))

(defn leading-trivia-width
  (^js [super-expression]
   (.getLeadingTriviaWidth ^js super-expression))
  (^js [super-expression source-file]
   (.getLeadingTriviaWidth ^js super-expression source-file)))

(defn full-text
  (^js [super-expression]
   (.getFullText ^js super-expression))
  (^js [super-expression source-file]
   (.getFullText ^js super-expression source-file)))

(defn text
  (^js [super-expression]
   (.getText ^js super-expression))
  (^js [super-expression source-file]
   (.getText ^js super-expression source-file)))

(defn first-token
  (^js [super-expression]
   (.getFirstToken ^js super-expression))
  (^js [super-expression source-file]
   (.getFirstToken ^js super-expression source-file)))

(defn last-token
  (^js [super-expression]
   (.getLastToken ^js super-expression))
  (^js [super-expression source-file]
   (.getLastToken ^js super-expression source-file)))

(defn for-each-child
  (^js [super-expression cb-node]
   (.forEachChild ^js super-expression cb-node))
  (^js [super-expression cb-node cb-node-array]
   (.forEachChild ^js super-expression cb-node cb-node-array)))

(defn pos
  ^js [super-expression]
  (.-pos ^js super-expression))

(defn end
  ^js [super-expression]
  (.-end ^js super-expression))
