(ns dots.typescript.false-literal)

(defn kind
  ^js [false-literal]
  (.-kind ^js false-literal))

(defn flags
  ^js [false-literal]
  (.-flags ^js false-literal))

(defn parent
  ^js [false-literal]
  (.-parent ^js false-literal))

(defn source-file
  ^js [false-literal]
  (.getSourceFile ^js false-literal))

(defn child-count
  (^js [false-literal]
   (.getChildCount ^js false-literal))
  (^js [false-literal source-file]
   (.getChildCount ^js false-literal source-file)))

(defn child-at
  (^js [false-literal index]
   (.getChildAt ^js false-literal index))
  (^js [false-literal index source-file]
   (.getChildAt ^js false-literal index source-file)))

(defn children
  (^js [false-literal]
   (.getChildren ^js false-literal))
  (^js [false-literal source-file]
   (.getChildren ^js false-literal source-file)))

(defn start
  (^js [false-literal]
   (.getStart ^js false-literal))
  (^js [false-literal source-file]
   (.getStart ^js false-literal source-file))
  (^js [false-literal source-file include-js-doc-comment?]
   (.getStart ^js false-literal source-file include-js-doc-comment?)))

(defn full-start
  ^js [false-literal]
  (.getFullStart ^js false-literal))

(defn get-end
  ^js [false-literal]
  (.getEnd ^js false-literal))

(defn width
  (^js [false-literal]
   (.getWidth ^js false-literal))
  (^js [false-literal source-file]
   (.getWidth ^js false-literal source-file)))

(defn full-width
  ^js [false-literal]
  (.getFullWidth ^js false-literal))

(defn leading-trivia-width
  (^js [false-literal]
   (.getLeadingTriviaWidth ^js false-literal))
  (^js [false-literal source-file]
   (.getLeadingTriviaWidth ^js false-literal source-file)))

(defn full-text
  (^js [false-literal]
   (.getFullText ^js false-literal))
  (^js [false-literal source-file]
   (.getFullText ^js false-literal source-file)))

(defn text
  (^js [false-literal]
   (.getText ^js false-literal))
  (^js [false-literal source-file]
   (.getText ^js false-literal source-file)))

(defn first-token
  (^js [false-literal]
   (.getFirstToken ^js false-literal))
  (^js [false-literal source-file]
   (.getFirstToken ^js false-literal source-file)))

(defn last-token
  (^js [false-literal]
   (.getLastToken ^js false-literal))
  (^js [false-literal source-file]
   (.getLastToken ^js false-literal source-file)))

(defn for-each-child
  (^js [false-literal cb-node]
   (.forEachChild ^js false-literal cb-node))
  (^js [false-literal cb-node cb-node-array]
   (.forEachChild ^js false-literal cb-node cb-node-array)))

(defn decorators
  ^js [false-literal]
  (.-decorators ^js false-literal))

(defn modifiers
  ^js [false-literal]
  (.-modifiers ^js false-literal))

(defn pos
  ^js [false-literal]
  (.-pos ^js false-literal))

(defn end
  ^js [false-literal]
  (.-end ^js false-literal))
