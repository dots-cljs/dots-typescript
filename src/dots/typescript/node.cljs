(ns dots.typescript.node)

(defn kind
  ^js [node]
  (.-kind ^js node))

(defn flags
  ^js [node]
  (.-flags ^js node))

(defn parent
  ^js [node]
  (.-parent ^js node))

(defn source-file
  ^js [node]
  (.getSourceFile ^js node))

(defn child-count
  (^js [node]
   (.getChildCount ^js node))
  (^js [node source-file]
   (.getChildCount ^js node source-file)))

(defn child-at
  (^js [node index]
   (.getChildAt ^js node index))
  (^js [node index source-file]
   (.getChildAt ^js node index source-file)))

(defn children
  (^js [node]
   (.getChildren ^js node))
  (^js [node source-file]
   (.getChildren ^js node source-file)))

(defn start
  (^js [node]
   (.getStart ^js node))
  (^js [node source-file]
   (.getStart ^js node source-file))
  (^js [node source-file include-js-doc-comment?]
   (.getStart ^js node source-file include-js-doc-comment?)))

(defn full-start
  ^js [node]
  (.getFullStart ^js node))

(defn get-end
  ^js [node]
  (.getEnd ^js node))

(defn width
  (^js [node]
   (.getWidth ^js node))
  (^js [node source-file]
   (.getWidth ^js node source-file)))

(defn full-width
  ^js [node]
  (.getFullWidth ^js node))

(defn leading-trivia-width
  (^js [node]
   (.getLeadingTriviaWidth ^js node))
  (^js [node source-file]
   (.getLeadingTriviaWidth ^js node source-file)))

(defn full-text
  (^js [node]
   (.getFullText ^js node))
  (^js [node source-file]
   (.getFullText ^js node source-file)))

(defn text
  (^js [node]
   (.getText ^js node))
  (^js [node source-file]
   (.getText ^js node source-file)))

(defn first-token
  (^js [node]
   (.getFirstToken ^js node))
  (^js [node source-file]
   (.getFirstToken ^js node source-file)))

(defn last-token
  (^js [node]
   (.getLastToken ^js node))
  (^js [node source-file]
   (.getLastToken ^js node source-file)))

(defn for-each-child
  (^js [node cb-node]
   (.forEachChild ^js node cb-node))
  (^js [node cb-node cb-node-array]
   (.forEachChild ^js node cb-node cb-node-array)))

(defn decorators
  ^js [node]
  (.-decorators ^js node))

(defn modifiers
  ^js [node]
  (.-modifiers ^js node))

(defn pos
  ^js [node]
  (.-pos ^js node))

(defn end
  ^js [node]
  (.-end ^js node))
