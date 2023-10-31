(ns dots.typescript.literal-type-node)

(defn kind
  ^js [literal-type-node]
  (.-kind ^js literal-type-node))

(defn literal
  ^js [literal-type-node]
  (.-literal ^js literal-type-node))

(defn flags
  ^js [literal-type-node]
  (.-flags ^js literal-type-node))

(defn parent
  ^js [literal-type-node]
  (.-parent ^js literal-type-node))

(defn source-file
  ^js [literal-type-node]
  (.getSourceFile ^js literal-type-node))

(defn child-count
  (^js [literal-type-node]
   (.getChildCount ^js literal-type-node))
  (^js [literal-type-node source-file]
   (.getChildCount ^js literal-type-node source-file)))

(defn child-at
  (^js [literal-type-node index]
   (.getChildAt ^js literal-type-node index))
  (^js [literal-type-node index source-file]
   (.getChildAt ^js literal-type-node index source-file)))

(defn children
  (^js [literal-type-node]
   (.getChildren ^js literal-type-node))
  (^js [literal-type-node source-file]
   (.getChildren ^js literal-type-node source-file)))

(defn start
  (^js [literal-type-node]
   (.getStart ^js literal-type-node))
  (^js [literal-type-node source-file]
   (.getStart ^js literal-type-node source-file))
  (^js [literal-type-node source-file include-js-doc-comment?]
   (.getStart ^js literal-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [literal-type-node]
  (.getFullStart ^js literal-type-node))

(defn get-end
  ^js [literal-type-node]
  (.getEnd ^js literal-type-node))

(defn width
  (^js [literal-type-node]
   (.getWidth ^js literal-type-node))
  (^js [literal-type-node source-file]
   (.getWidth ^js literal-type-node source-file)))

(defn full-width
  ^js [literal-type-node]
  (.getFullWidth ^js literal-type-node))

(defn leading-trivia-width
  (^js [literal-type-node]
   (.getLeadingTriviaWidth ^js literal-type-node))
  (^js [literal-type-node source-file]
   (.getLeadingTriviaWidth ^js literal-type-node source-file)))

(defn full-text
  (^js [literal-type-node]
   (.getFullText ^js literal-type-node))
  (^js [literal-type-node source-file]
   (.getFullText ^js literal-type-node source-file)))

(defn text
  (^js [literal-type-node]
   (.getText ^js literal-type-node))
  (^js [literal-type-node source-file]
   (.getText ^js literal-type-node source-file)))

(defn first-token
  (^js [literal-type-node]
   (.getFirstToken ^js literal-type-node))
  (^js [literal-type-node source-file]
   (.getFirstToken ^js literal-type-node source-file)))

(defn last-token
  (^js [literal-type-node]
   (.getLastToken ^js literal-type-node))
  (^js [literal-type-node source-file]
   (.getLastToken ^js literal-type-node source-file)))

(defn for-each-child
  (^js [literal-type-node cb-node]
   (.forEachChild ^js literal-type-node cb-node))
  (^js [literal-type-node cb-node cb-node-array]
   (.forEachChild ^js literal-type-node cb-node cb-node-array)))

(defn pos
  ^js [literal-type-node]
  (.-pos ^js literal-type-node))

(defn end
  ^js [literal-type-node]
  (.-end ^js literal-type-node))
