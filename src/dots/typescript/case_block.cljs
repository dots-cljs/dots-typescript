(ns dots.typescript.case-block)

(defn kind
  ^js [case-block]
  (.-kind ^js case-block))

(defn parent
  ^js [case-block]
  (.-parent ^js case-block))

(defn clauses
  ^js [case-block]
  (.-clauses ^js case-block))

(defn flags
  ^js [case-block]
  (.-flags ^js case-block))

(defn source-file
  ^js [case-block]
  (.getSourceFile ^js case-block))

(defn child-count
  (^js [case-block]
   (.getChildCount ^js case-block))
  (^js [case-block source-file]
   (.getChildCount ^js case-block source-file)))

(defn child-at
  (^js [case-block index]
   (.getChildAt ^js case-block index))
  (^js [case-block index source-file]
   (.getChildAt ^js case-block index source-file)))

(defn children
  (^js [case-block]
   (.getChildren ^js case-block))
  (^js [case-block source-file]
   (.getChildren ^js case-block source-file)))

(defn start
  (^js [case-block]
   (.getStart ^js case-block))
  (^js [case-block source-file]
   (.getStart ^js case-block source-file))
  (^js [case-block source-file include-js-doc-comment?]
   (.getStart ^js case-block source-file include-js-doc-comment?)))

(defn full-start
  ^js [case-block]
  (.getFullStart ^js case-block))

(defn get-end
  ^js [case-block]
  (.getEnd ^js case-block))

(defn width
  (^js [case-block]
   (.getWidth ^js case-block))
  (^js [case-block source-file]
   (.getWidth ^js case-block source-file)))

(defn full-width
  ^js [case-block]
  (.getFullWidth ^js case-block))

(defn leading-trivia-width
  (^js [case-block]
   (.getLeadingTriviaWidth ^js case-block))
  (^js [case-block source-file]
   (.getLeadingTriviaWidth ^js case-block source-file)))

(defn full-text
  (^js [case-block]
   (.getFullText ^js case-block))
  (^js [case-block source-file]
   (.getFullText ^js case-block source-file)))

(defn text
  (^js [case-block]
   (.getText ^js case-block))
  (^js [case-block source-file]
   (.getText ^js case-block source-file)))

(defn first-token
  (^js [case-block]
   (.getFirstToken ^js case-block))
  (^js [case-block source-file]
   (.getFirstToken ^js case-block source-file)))

(defn last-token
  (^js [case-block]
   (.getLastToken ^js case-block))
  (^js [case-block source-file]
   (.getLastToken ^js case-block source-file)))

(defn for-each-child
  (^js [case-block cb-node]
   (.forEachChild ^js case-block cb-node))
  (^js [case-block cb-node cb-node-array]
   (.forEachChild ^js case-block cb-node cb-node-array)))

(defn decorators
  ^js [case-block]
  (.-decorators ^js case-block))

(defn modifiers
  ^js [case-block]
  (.-modifiers ^js case-block))

(defn pos
  ^js [case-block]
  (.-pos ^js case-block))

(defn end
  ^js [case-block]
  (.-end ^js case-block))
