(ns dots.typescript.token)

(defn kind
  ^js [token]
  (.-kind ^js token))

(defn flags
  ^js [token]
  (.-flags ^js token))

(defn parent
  ^js [token]
  (.-parent ^js token))

(defn source-file
  ^js [token]
  (.getSourceFile ^js token))

(defn child-count
  (^js [token]
   (.getChildCount ^js token))
  (^js [token source-file]
   (.getChildCount ^js token source-file)))

(defn child-at
  (^js [token index]
   (.getChildAt ^js token index))
  (^js [token index source-file]
   (.getChildAt ^js token index source-file)))

(defn children
  (^js [token]
   (.getChildren ^js token))
  (^js [token source-file]
   (.getChildren ^js token source-file)))

(defn start
  (^js [token]
   (.getStart ^js token))
  (^js [token source-file]
   (.getStart ^js token source-file))
  (^js [token source-file include-js-doc-comment?]
   (.getStart ^js token source-file include-js-doc-comment?)))

(defn full-start
  ^js [token]
  (.getFullStart ^js token))

(defn get-end
  ^js [token]
  (.getEnd ^js token))

(defn width
  (^js [token]
   (.getWidth ^js token))
  (^js [token source-file]
   (.getWidth ^js token source-file)))

(defn full-width
  ^js [token]
  (.getFullWidth ^js token))

(defn leading-trivia-width
  (^js [token]
   (.getLeadingTriviaWidth ^js token))
  (^js [token source-file]
   (.getLeadingTriviaWidth ^js token source-file)))

(defn full-text
  (^js [token]
   (.getFullText ^js token))
  (^js [token source-file]
   (.getFullText ^js token source-file)))

(defn text
  (^js [token]
   (.getText ^js token))
  (^js [token source-file]
   (.getText ^js token source-file)))

(defn first-token
  (^js [token]
   (.getFirstToken ^js token))
  (^js [token source-file]
   (.getFirstToken ^js token source-file)))

(defn last-token
  (^js [token]
   (.getLastToken ^js token))
  (^js [token source-file]
   (.getLastToken ^js token source-file)))

(defn for-each-child
  (^js [token cb-node]
   (.forEachChild ^js token cb-node))
  (^js [token cb-node cb-node-array]
   (.forEachChild ^js token cb-node cb-node-array)))

(defn pos
  ^js [token]
  (.-pos ^js token))

(defn end
  ^js [token]
  (.-end ^js token))
