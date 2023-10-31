(ns dots.typescript.intersection-type-node)

(defn kind
  ^js [intersection-type-node]
  (.-kind ^js intersection-type-node))

(defn types
  ^js [intersection-type-node]
  (.-types ^js intersection-type-node))

(defn flags
  ^js [intersection-type-node]
  (.-flags ^js intersection-type-node))

(defn parent
  ^js [intersection-type-node]
  (.-parent ^js intersection-type-node))

(defn source-file
  ^js [intersection-type-node]
  (.getSourceFile ^js intersection-type-node))

(defn child-count
  (^js [intersection-type-node]
   (.getChildCount ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getChildCount ^js intersection-type-node source-file)))

(defn child-at
  (^js [intersection-type-node index]
   (.getChildAt ^js intersection-type-node index))
  (^js [intersection-type-node index source-file]
   (.getChildAt ^js intersection-type-node index source-file)))

(defn children
  (^js [intersection-type-node]
   (.getChildren ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getChildren ^js intersection-type-node source-file)))

(defn start
  (^js [intersection-type-node]
   (.getStart ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getStart ^js intersection-type-node source-file))
  (^js [intersection-type-node source-file include-js-doc-comment?]
   (.getStart ^js intersection-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [intersection-type-node]
  (.getFullStart ^js intersection-type-node))

(defn get-end
  ^js [intersection-type-node]
  (.getEnd ^js intersection-type-node))

(defn width
  (^js [intersection-type-node]
   (.getWidth ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getWidth ^js intersection-type-node source-file)))

(defn full-width
  ^js [intersection-type-node]
  (.getFullWidth ^js intersection-type-node))

(defn leading-trivia-width
  (^js [intersection-type-node]
   (.getLeadingTriviaWidth ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getLeadingTriviaWidth ^js intersection-type-node source-file)))

(defn full-text
  (^js [intersection-type-node]
   (.getFullText ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getFullText ^js intersection-type-node source-file)))

(defn text
  (^js [intersection-type-node]
   (.getText ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getText ^js intersection-type-node source-file)))

(defn first-token
  (^js [intersection-type-node]
   (.getFirstToken ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getFirstToken ^js intersection-type-node source-file)))

(defn last-token
  (^js [intersection-type-node]
   (.getLastToken ^js intersection-type-node))
  (^js [intersection-type-node source-file]
   (.getLastToken ^js intersection-type-node source-file)))

(defn for-each-child
  (^js [intersection-type-node cb-node]
   (.forEachChild ^js intersection-type-node cb-node))
  (^js [intersection-type-node cb-node cb-node-array]
   (.forEachChild ^js intersection-type-node cb-node cb-node-array)))

(defn decorators
  ^js [intersection-type-node]
  (.-decorators ^js intersection-type-node))

(defn modifiers
  ^js [intersection-type-node]
  (.-modifiers ^js intersection-type-node))

(defn pos
  ^js [intersection-type-node]
  (.-pos ^js intersection-type-node))

(defn end
  ^js [intersection-type-node]
  (.-end ^js intersection-type-node))
