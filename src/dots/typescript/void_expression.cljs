(ns dots.typescript.void-expression)

(defn kind
  ^js [void-expression]
  (.-kind ^js void-expression))

(defn expression
  ^js [void-expression]
  (.-expression ^js void-expression))

(defn flags
  ^js [void-expression]
  (.-flags ^js void-expression))

(defn parent
  ^js [void-expression]
  (.-parent ^js void-expression))

(defn source-file
  ^js [void-expression]
  (.getSourceFile ^js void-expression))

(defn child-count
  (^js [void-expression]
   (.getChildCount ^js void-expression))
  (^js [void-expression source-file]
   (.getChildCount ^js void-expression source-file)))

(defn child-at
  (^js [void-expression index]
   (.getChildAt ^js void-expression index))
  (^js [void-expression index source-file]
   (.getChildAt ^js void-expression index source-file)))

(defn children
  (^js [void-expression]
   (.getChildren ^js void-expression))
  (^js [void-expression source-file]
   (.getChildren ^js void-expression source-file)))

(defn start
  (^js [void-expression]
   (.getStart ^js void-expression))
  (^js [void-expression source-file]
   (.getStart ^js void-expression source-file))
  (^js [void-expression source-file include-js-doc-comment?]
   (.getStart ^js void-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [void-expression]
  (.getFullStart ^js void-expression))

(defn get-end
  ^js [void-expression]
  (.getEnd ^js void-expression))

(defn width
  (^js [void-expression]
   (.getWidth ^js void-expression))
  (^js [void-expression source-file]
   (.getWidth ^js void-expression source-file)))

(defn full-width
  ^js [void-expression]
  (.getFullWidth ^js void-expression))

(defn leading-trivia-width
  (^js [void-expression]
   (.getLeadingTriviaWidth ^js void-expression))
  (^js [void-expression source-file]
   (.getLeadingTriviaWidth ^js void-expression source-file)))

(defn full-text
  (^js [void-expression]
   (.getFullText ^js void-expression))
  (^js [void-expression source-file]
   (.getFullText ^js void-expression source-file)))

(defn text
  (^js [void-expression]
   (.getText ^js void-expression))
  (^js [void-expression source-file]
   (.getText ^js void-expression source-file)))

(defn first-token
  (^js [void-expression]
   (.getFirstToken ^js void-expression))
  (^js [void-expression source-file]
   (.getFirstToken ^js void-expression source-file)))

(defn last-token
  (^js [void-expression]
   (.getLastToken ^js void-expression))
  (^js [void-expression source-file]
   (.getLastToken ^js void-expression source-file)))

(defn for-each-child
  (^js [void-expression cb-node]
   (.forEachChild ^js void-expression cb-node))
  (^js [void-expression cb-node cb-node-array]
   (.forEachChild ^js void-expression cb-node cb-node-array)))

(defn decorators
  ^js [void-expression]
  (.-decorators ^js void-expression))

(defn modifiers
  ^js [void-expression]
  (.-modifiers ^js void-expression))

(defn pos
  ^js [void-expression]
  (.-pos ^js void-expression))

(defn end
  ^js [void-expression]
  (.-end ^js void-expression))
