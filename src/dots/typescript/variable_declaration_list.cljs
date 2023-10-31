(ns dots.typescript.variable-declaration-list)

(defn kind
  ^js [variable-declaration-list]
  (.-kind ^js variable-declaration-list))

(defn parent
  ^js [variable-declaration-list]
  (.-parent ^js variable-declaration-list))

(defn declarations
  ^js [variable-declaration-list]
  (.-declarations ^js variable-declaration-list))

(defn flags
  ^js [variable-declaration-list]
  (.-flags ^js variable-declaration-list))

(defn source-file
  ^js [variable-declaration-list]
  (.getSourceFile ^js variable-declaration-list))

(defn child-count
  (^js [variable-declaration-list]
   (.getChildCount ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getChildCount ^js variable-declaration-list source-file)))

(defn child-at
  (^js [variable-declaration-list index]
   (.getChildAt ^js variable-declaration-list index))
  (^js [variable-declaration-list index source-file]
   (.getChildAt ^js variable-declaration-list index source-file)))

(defn children
  (^js [variable-declaration-list]
   (.getChildren ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getChildren ^js variable-declaration-list source-file)))

(defn start
  (^js [variable-declaration-list]
   (.getStart ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getStart ^js variable-declaration-list source-file))
  (^js [variable-declaration-list source-file include-js-doc-comment?]
   (.getStart ^js variable-declaration-list source-file include-js-doc-comment?)))

(defn full-start
  ^js [variable-declaration-list]
  (.getFullStart ^js variable-declaration-list))

(defn get-end
  ^js [variable-declaration-list]
  (.getEnd ^js variable-declaration-list))

(defn width
  (^js [variable-declaration-list]
   (.getWidth ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getWidth ^js variable-declaration-list source-file)))

(defn full-width
  ^js [variable-declaration-list]
  (.getFullWidth ^js variable-declaration-list))

(defn leading-trivia-width
  (^js [variable-declaration-list]
   (.getLeadingTriviaWidth ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getLeadingTriviaWidth ^js variable-declaration-list source-file)))

(defn full-text
  (^js [variable-declaration-list]
   (.getFullText ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getFullText ^js variable-declaration-list source-file)))

(defn text
  (^js [variable-declaration-list]
   (.getText ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getText ^js variable-declaration-list source-file)))

(defn first-token
  (^js [variable-declaration-list]
   (.getFirstToken ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getFirstToken ^js variable-declaration-list source-file)))

(defn last-token
  (^js [variable-declaration-list]
   (.getLastToken ^js variable-declaration-list))
  (^js [variable-declaration-list source-file]
   (.getLastToken ^js variable-declaration-list source-file)))

(defn for-each-child
  (^js [variable-declaration-list cb-node]
   (.forEachChild ^js variable-declaration-list cb-node))
  (^js [variable-declaration-list cb-node cb-node-array]
   (.forEachChild ^js variable-declaration-list cb-node cb-node-array)))

(defn pos
  ^js [variable-declaration-list]
  (.-pos ^js variable-declaration-list))

(defn end
  ^js [variable-declaration-list]
  (.-end ^js variable-declaration-list))
