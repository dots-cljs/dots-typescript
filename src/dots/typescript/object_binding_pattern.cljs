(ns dots.typescript.object-binding-pattern)

(defn kind
  ^js [object-binding-pattern]
  (.-kind ^js object-binding-pattern))

(defn parent
  ^js [object-binding-pattern]
  (.-parent ^js object-binding-pattern))

(defn elements
  ^js [object-binding-pattern]
  (.-elements ^js object-binding-pattern))

(defn flags
  ^js [object-binding-pattern]
  (.-flags ^js object-binding-pattern))

(defn source-file
  ^js [object-binding-pattern]
  (.getSourceFile ^js object-binding-pattern))

(defn child-count
  (^js [object-binding-pattern]
   (.getChildCount ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getChildCount ^js object-binding-pattern source-file)))

(defn child-at
  (^js [object-binding-pattern index]
   (.getChildAt ^js object-binding-pattern index))
  (^js [object-binding-pattern index source-file]
   (.getChildAt ^js object-binding-pattern index source-file)))

(defn children
  (^js [object-binding-pattern]
   (.getChildren ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getChildren ^js object-binding-pattern source-file)))

(defn start
  (^js [object-binding-pattern]
   (.getStart ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getStart ^js object-binding-pattern source-file))
  (^js [object-binding-pattern source-file include-js-doc-comment?]
   (.getStart ^js object-binding-pattern source-file include-js-doc-comment?)))

(defn full-start
  ^js [object-binding-pattern]
  (.getFullStart ^js object-binding-pattern))

(defn get-end
  ^js [object-binding-pattern]
  (.getEnd ^js object-binding-pattern))

(defn width
  (^js [object-binding-pattern]
   (.getWidth ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getWidth ^js object-binding-pattern source-file)))

(defn full-width
  ^js [object-binding-pattern]
  (.getFullWidth ^js object-binding-pattern))

(defn leading-trivia-width
  (^js [object-binding-pattern]
   (.getLeadingTriviaWidth ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getLeadingTriviaWidth ^js object-binding-pattern source-file)))

(defn full-text
  (^js [object-binding-pattern]
   (.getFullText ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getFullText ^js object-binding-pattern source-file)))

(defn text
  (^js [object-binding-pattern]
   (.getText ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getText ^js object-binding-pattern source-file)))

(defn first-token
  (^js [object-binding-pattern]
   (.getFirstToken ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getFirstToken ^js object-binding-pattern source-file)))

(defn last-token
  (^js [object-binding-pattern]
   (.getLastToken ^js object-binding-pattern))
  (^js [object-binding-pattern source-file]
   (.getLastToken ^js object-binding-pattern source-file)))

(defn for-each-child
  (^js [object-binding-pattern cb-node]
   (.forEachChild ^js object-binding-pattern cb-node))
  (^js [object-binding-pattern cb-node cb-node-array]
   (.forEachChild ^js object-binding-pattern cb-node cb-node-array)))

(defn decorators
  ^js [object-binding-pattern]
  (.-decorators ^js object-binding-pattern))

(defn modifiers
  ^js [object-binding-pattern]
  (.-modifiers ^js object-binding-pattern))

(defn pos
  ^js [object-binding-pattern]
  (.-pos ^js object-binding-pattern))

(defn end
  ^js [object-binding-pattern]
  (.-end ^js object-binding-pattern))
