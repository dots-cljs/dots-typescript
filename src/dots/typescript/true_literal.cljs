(ns dots.typescript.true-literal)

(defn kind
  ^js [true-literal]
  (.-kind ^js true-literal))

(defn flags
  ^js [true-literal]
  (.-flags ^js true-literal))

(defn parent
  ^js [true-literal]
  (.-parent ^js true-literal))

(defn source-file
  ^js [true-literal]
  (.getSourceFile ^js true-literal))

(defn child-count
  (^js [true-literal]
   (.getChildCount ^js true-literal))
  (^js [true-literal source-file]
   (.getChildCount ^js true-literal source-file)))

(defn child-at
  (^js [true-literal index]
   (.getChildAt ^js true-literal index))
  (^js [true-literal index source-file]
   (.getChildAt ^js true-literal index source-file)))

(defn children
  (^js [true-literal]
   (.getChildren ^js true-literal))
  (^js [true-literal source-file]
   (.getChildren ^js true-literal source-file)))

(defn start
  (^js [true-literal]
   (.getStart ^js true-literal))
  (^js [true-literal source-file]
   (.getStart ^js true-literal source-file))
  (^js [true-literal source-file include-js-doc-comment?]
   (.getStart ^js true-literal source-file include-js-doc-comment?)))

(defn full-start
  ^js [true-literal]
  (.getFullStart ^js true-literal))

(defn get-end
  ^js [true-literal]
  (.getEnd ^js true-literal))

(defn width
  (^js [true-literal]
   (.getWidth ^js true-literal))
  (^js [true-literal source-file]
   (.getWidth ^js true-literal source-file)))

(defn full-width
  ^js [true-literal]
  (.getFullWidth ^js true-literal))

(defn leading-trivia-width
  (^js [true-literal]
   (.getLeadingTriviaWidth ^js true-literal))
  (^js [true-literal source-file]
   (.getLeadingTriviaWidth ^js true-literal source-file)))

(defn full-text
  (^js [true-literal]
   (.getFullText ^js true-literal))
  (^js [true-literal source-file]
   (.getFullText ^js true-literal source-file)))

(defn text
  (^js [true-literal]
   (.getText ^js true-literal))
  (^js [true-literal source-file]
   (.getText ^js true-literal source-file)))

(defn first-token
  (^js [true-literal]
   (.getFirstToken ^js true-literal))
  (^js [true-literal source-file]
   (.getFirstToken ^js true-literal source-file)))

(defn last-token
  (^js [true-literal]
   (.getLastToken ^js true-literal))
  (^js [true-literal source-file]
   (.getLastToken ^js true-literal source-file)))

(defn for-each-child
  (^js [true-literal cb-node]
   (.forEachChild ^js true-literal cb-node))
  (^js [true-literal cb-node cb-node-array]
   (.forEachChild ^js true-literal cb-node cb-node-array)))

(defn decorators
  ^js [true-literal]
  (.-decorators ^js true-literal))

(defn modifiers
  ^js [true-literal]
  (.-modifiers ^js true-literal))

(defn pos
  ^js [true-literal]
  (.-pos ^js true-literal))

(defn end
  ^js [true-literal]
  (.-end ^js true-literal))
