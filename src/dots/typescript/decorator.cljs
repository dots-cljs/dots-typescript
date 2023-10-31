(ns dots.typescript.decorator)

(defn kind
  ^js [decorator]
  (.-kind ^js decorator))

(defn parent
  ^js [decorator]
  (.-parent ^js decorator))

(defn expression
  ^js [decorator]
  (.-expression ^js decorator))

(defn flags
  ^js [decorator]
  (.-flags ^js decorator))

(defn source-file
  ^js [decorator]
  (.getSourceFile ^js decorator))

(defn child-count
  (^js [decorator]
   (.getChildCount ^js decorator))
  (^js [decorator source-file]
   (.getChildCount ^js decorator source-file)))

(defn child-at
  (^js [decorator index]
   (.getChildAt ^js decorator index))
  (^js [decorator index source-file]
   (.getChildAt ^js decorator index source-file)))

(defn children
  (^js [decorator]
   (.getChildren ^js decorator))
  (^js [decorator source-file]
   (.getChildren ^js decorator source-file)))

(defn start
  (^js [decorator]
   (.getStart ^js decorator))
  (^js [decorator source-file]
   (.getStart ^js decorator source-file))
  (^js [decorator source-file include-js-doc-comment?]
   (.getStart ^js decorator source-file include-js-doc-comment?)))

(defn full-start
  ^js [decorator]
  (.getFullStart ^js decorator))

(defn get-end
  ^js [decorator]
  (.getEnd ^js decorator))

(defn width
  (^js [decorator]
   (.getWidth ^js decorator))
  (^js [decorator source-file]
   (.getWidth ^js decorator source-file)))

(defn full-width
  ^js [decorator]
  (.getFullWidth ^js decorator))

(defn leading-trivia-width
  (^js [decorator]
   (.getLeadingTriviaWidth ^js decorator))
  (^js [decorator source-file]
   (.getLeadingTriviaWidth ^js decorator source-file)))

(defn full-text
  (^js [decorator]
   (.getFullText ^js decorator))
  (^js [decorator source-file]
   (.getFullText ^js decorator source-file)))

(defn text
  (^js [decorator]
   (.getText ^js decorator))
  (^js [decorator source-file]
   (.getText ^js decorator source-file)))

(defn first-token
  (^js [decorator]
   (.getFirstToken ^js decorator))
  (^js [decorator source-file]
   (.getFirstToken ^js decorator source-file)))

(defn last-token
  (^js [decorator]
   (.getLastToken ^js decorator))
  (^js [decorator source-file]
   (.getLastToken ^js decorator source-file)))

(defn for-each-child
  (^js [decorator cb-node]
   (.forEachChild ^js decorator cb-node))
  (^js [decorator cb-node cb-node-array]
   (.forEachChild ^js decorator cb-node cb-node-array)))

(defn pos
  ^js [decorator]
  (.-pos ^js decorator))

(defn end
  ^js [decorator]
  (.-end ^js decorator))
