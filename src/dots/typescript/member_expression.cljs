(ns dots.typescript.member-expression)

(defn kind
  ^js [member-expression]
  (.-kind ^js member-expression))

(defn flags
  ^js [member-expression]
  (.-flags ^js member-expression))

(defn parent
  ^js [member-expression]
  (.-parent ^js member-expression))

(defn source-file
  ^js [member-expression]
  (.getSourceFile ^js member-expression))

(defn child-count
  (^js [member-expression]
   (.getChildCount ^js member-expression))
  (^js [member-expression source-file]
   (.getChildCount ^js member-expression source-file)))

(defn child-at
  (^js [member-expression index]
   (.getChildAt ^js member-expression index))
  (^js [member-expression index source-file]
   (.getChildAt ^js member-expression index source-file)))

(defn children
  (^js [member-expression]
   (.getChildren ^js member-expression))
  (^js [member-expression source-file]
   (.getChildren ^js member-expression source-file)))

(defn start
  (^js [member-expression]
   (.getStart ^js member-expression))
  (^js [member-expression source-file]
   (.getStart ^js member-expression source-file))
  (^js [member-expression source-file include-js-doc-comment?]
   (.getStart ^js member-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [member-expression]
  (.getFullStart ^js member-expression))

(defn get-end
  ^js [member-expression]
  (.getEnd ^js member-expression))

(defn width
  (^js [member-expression]
   (.getWidth ^js member-expression))
  (^js [member-expression source-file]
   (.getWidth ^js member-expression source-file)))

(defn full-width
  ^js [member-expression]
  (.getFullWidth ^js member-expression))

(defn leading-trivia-width
  (^js [member-expression]
   (.getLeadingTriviaWidth ^js member-expression))
  (^js [member-expression source-file]
   (.getLeadingTriviaWidth ^js member-expression source-file)))

(defn full-text
  (^js [member-expression]
   (.getFullText ^js member-expression))
  (^js [member-expression source-file]
   (.getFullText ^js member-expression source-file)))

(defn text
  (^js [member-expression]
   (.getText ^js member-expression))
  (^js [member-expression source-file]
   (.getText ^js member-expression source-file)))

(defn first-token
  (^js [member-expression]
   (.getFirstToken ^js member-expression))
  (^js [member-expression source-file]
   (.getFirstToken ^js member-expression source-file)))

(defn last-token
  (^js [member-expression]
   (.getLastToken ^js member-expression))
  (^js [member-expression source-file]
   (.getLastToken ^js member-expression source-file)))

(defn for-each-child
  (^js [member-expression cb-node]
   (.forEachChild ^js member-expression cb-node))
  (^js [member-expression cb-node cb-node-array]
   (.forEachChild ^js member-expression cb-node cb-node-array)))

(defn decorators
  ^js [member-expression]
  (.-decorators ^js member-expression))

(defn modifiers
  ^js [member-expression]
  (.-modifiers ^js member-expression))

(defn pos
  ^js [member-expression]
  (.-pos ^js member-expression))

(defn end
  ^js [member-expression]
  (.-end ^js member-expression))
