(ns dots.typescript.syntax-list)

(defn kind
  ^js [syntax-list]
  (.-kind ^js syntax-list))

(defn set-kind!
  ^js [syntax-list value]
  (set! (.-kind ^js syntax-list) value))

(defn flags
  ^js [syntax-list]
  (.-flags ^js syntax-list))

(defn parent
  ^js [syntax-list]
  (.-parent ^js syntax-list))

(defn source-file
  ^js [syntax-list]
  (.getSourceFile ^js syntax-list))

(defn child-count
  (^js [syntax-list]
   (.getChildCount ^js syntax-list))
  (^js [syntax-list source-file]
   (.getChildCount ^js syntax-list source-file)))

(defn child-at
  (^js [syntax-list index]
   (.getChildAt ^js syntax-list index))
  (^js [syntax-list index source-file]
   (.getChildAt ^js syntax-list index source-file)))

(defn children
  (^js [syntax-list]
   (.getChildren ^js syntax-list))
  (^js [syntax-list source-file]
   (.getChildren ^js syntax-list source-file)))

(defn start
  (^js [syntax-list]
   (.getStart ^js syntax-list))
  (^js [syntax-list source-file]
   (.getStart ^js syntax-list source-file))
  (^js [syntax-list source-file include-js-doc-comment?]
   (.getStart ^js syntax-list source-file include-js-doc-comment?)))

(defn full-start
  ^js [syntax-list]
  (.getFullStart ^js syntax-list))

(defn get-end
  ^js [syntax-list]
  (.getEnd ^js syntax-list))

(defn width
  (^js [syntax-list]
   (.getWidth ^js syntax-list))
  (^js [syntax-list source-file]
   (.getWidth ^js syntax-list source-file)))

(defn full-width
  ^js [syntax-list]
  (.getFullWidth ^js syntax-list))

(defn leading-trivia-width
  (^js [syntax-list]
   (.getLeadingTriviaWidth ^js syntax-list))
  (^js [syntax-list source-file]
   (.getLeadingTriviaWidth ^js syntax-list source-file)))

(defn full-text
  (^js [syntax-list]
   (.getFullText ^js syntax-list))
  (^js [syntax-list source-file]
   (.getFullText ^js syntax-list source-file)))

(defn text
  (^js [syntax-list]
   (.getText ^js syntax-list))
  (^js [syntax-list source-file]
   (.getText ^js syntax-list source-file)))

(defn first-token
  (^js [syntax-list]
   (.getFirstToken ^js syntax-list))
  (^js [syntax-list source-file]
   (.getFirstToken ^js syntax-list source-file)))

(defn last-token
  (^js [syntax-list]
   (.getLastToken ^js syntax-list))
  (^js [syntax-list source-file]
   (.getLastToken ^js syntax-list source-file)))

(defn for-each-child
  (^js [syntax-list cb-node]
   (.forEachChild ^js syntax-list cb-node))
  (^js [syntax-list cb-node cb-node-array]
   (.forEachChild ^js syntax-list cb-node cb-node-array)))

(defn decorators
  ^js [syntax-list]
  (.-decorators ^js syntax-list))

(defn modifiers
  ^js [syntax-list]
  (.-modifiers ^js syntax-list))

(defn pos
  ^js [syntax-list]
  (.-pos ^js syntax-list))

(defn end
  ^js [syntax-list]
  (.-end ^js syntax-list))
