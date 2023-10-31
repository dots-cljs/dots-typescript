(ns dots.typescript.null-literal)

(defn kind
  ^js [null-literal]
  (.-kind ^js null-literal))

(defn flags
  ^js [null-literal]
  (.-flags ^js null-literal))

(defn parent
  ^js [null-literal]
  (.-parent ^js null-literal))

(defn source-file
  ^js [null-literal]
  (.getSourceFile ^js null-literal))

(defn child-count
  (^js [null-literal]
   (.getChildCount ^js null-literal))
  (^js [null-literal source-file]
   (.getChildCount ^js null-literal source-file)))

(defn child-at
  (^js [null-literal index]
   (.getChildAt ^js null-literal index))
  (^js [null-literal index source-file]
   (.getChildAt ^js null-literal index source-file)))

(defn children
  (^js [null-literal]
   (.getChildren ^js null-literal))
  (^js [null-literal source-file]
   (.getChildren ^js null-literal source-file)))

(defn start
  (^js [null-literal]
   (.getStart ^js null-literal))
  (^js [null-literal source-file]
   (.getStart ^js null-literal source-file))
  (^js [null-literal source-file include-js-doc-comment?]
   (.getStart ^js null-literal source-file include-js-doc-comment?)))

(defn full-start
  ^js [null-literal]
  (.getFullStart ^js null-literal))

(defn get-end
  ^js [null-literal]
  (.getEnd ^js null-literal))

(defn width
  (^js [null-literal]
   (.getWidth ^js null-literal))
  (^js [null-literal source-file]
   (.getWidth ^js null-literal source-file)))

(defn full-width
  ^js [null-literal]
  (.getFullWidth ^js null-literal))

(defn leading-trivia-width
  (^js [null-literal]
   (.getLeadingTriviaWidth ^js null-literal))
  (^js [null-literal source-file]
   (.getLeadingTriviaWidth ^js null-literal source-file)))

(defn full-text
  (^js [null-literal]
   (.getFullText ^js null-literal))
  (^js [null-literal source-file]
   (.getFullText ^js null-literal source-file)))

(defn text
  (^js [null-literal]
   (.getText ^js null-literal))
  (^js [null-literal source-file]
   (.getText ^js null-literal source-file)))

(defn first-token
  (^js [null-literal]
   (.getFirstToken ^js null-literal))
  (^js [null-literal source-file]
   (.getFirstToken ^js null-literal source-file)))

(defn last-token
  (^js [null-literal]
   (.getLastToken ^js null-literal))
  (^js [null-literal source-file]
   (.getLastToken ^js null-literal source-file)))

(defn for-each-child
  (^js [null-literal cb-node]
   (.forEachChild ^js null-literal cb-node))
  (^js [null-literal cb-node cb-node-array]
   (.forEachChild ^js null-literal cb-node cb-node-array)))

(defn decorators
  ^js [null-literal]
  (.-decorators ^js null-literal))

(defn modifiers
  ^js [null-literal]
  (.-modifiers ^js null-literal))

(defn pos
  ^js [null-literal]
  (.-pos ^js null-literal))

(defn end
  ^js [null-literal]
  (.-end ^js null-literal))
