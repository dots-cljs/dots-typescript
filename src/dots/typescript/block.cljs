(ns dots.typescript.block)

(defn kind
  ^js [block]
  (.-kind ^js block))

(defn statements
  ^js [block]
  (.-statements ^js block))

(defn flags
  ^js [block]
  (.-flags ^js block))

(defn parent
  ^js [block]
  (.-parent ^js block))

(defn source-file
  ^js [block]
  (.getSourceFile ^js block))

(defn child-count
  (^js [block]
   (.getChildCount ^js block))
  (^js [block source-file]
   (.getChildCount ^js block source-file)))

(defn child-at
  (^js [block index]
   (.getChildAt ^js block index))
  (^js [block index source-file]
   (.getChildAt ^js block index source-file)))

(defn children
  (^js [block]
   (.getChildren ^js block))
  (^js [block source-file]
   (.getChildren ^js block source-file)))

(defn start
  (^js [block]
   (.getStart ^js block))
  (^js [block source-file]
   (.getStart ^js block source-file))
  (^js [block source-file include-js-doc-comment?]
   (.getStart ^js block source-file include-js-doc-comment?)))

(defn full-start
  ^js [block]
  (.getFullStart ^js block))

(defn get-end
  ^js [block]
  (.getEnd ^js block))

(defn width
  (^js [block]
   (.getWidth ^js block))
  (^js [block source-file]
   (.getWidth ^js block source-file)))

(defn full-width
  ^js [block]
  (.getFullWidth ^js block))

(defn leading-trivia-width
  (^js [block]
   (.getLeadingTriviaWidth ^js block))
  (^js [block source-file]
   (.getLeadingTriviaWidth ^js block source-file)))

(defn full-text
  (^js [block]
   (.getFullText ^js block))
  (^js [block source-file]
   (.getFullText ^js block source-file)))

(defn text
  (^js [block]
   (.getText ^js block))
  (^js [block source-file]
   (.getText ^js block source-file)))

(defn first-token
  (^js [block]
   (.getFirstToken ^js block))
  (^js [block source-file]
   (.getFirstToken ^js block source-file)))

(defn last-token
  (^js [block]
   (.getLastToken ^js block))
  (^js [block source-file]
   (.getLastToken ^js block source-file)))

(defn for-each-child
  (^js [block cb-node]
   (.forEachChild ^js block cb-node))
  (^js [block cb-node cb-node-array]
   (.forEachChild ^js block cb-node cb-node-array)))

(defn pos
  ^js [block]
  (.-pos ^js block))

(defn end
  ^js [block]
  (.-end ^js block))
