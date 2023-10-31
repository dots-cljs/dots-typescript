(ns dots.typescript.declaration)

(defn kind
  ^js [declaration]
  (.-kind ^js declaration))

(defn flags
  ^js [declaration]
  (.-flags ^js declaration))

(defn parent
  ^js [declaration]
  (.-parent ^js declaration))

(defn source-file
  ^js [declaration]
  (.getSourceFile ^js declaration))

(defn child-count
  (^js [declaration]
   (.getChildCount ^js declaration))
  (^js [declaration source-file]
   (.getChildCount ^js declaration source-file)))

(defn child-at
  (^js [declaration index]
   (.getChildAt ^js declaration index))
  (^js [declaration index source-file]
   (.getChildAt ^js declaration index source-file)))

(defn children
  (^js [declaration]
   (.getChildren ^js declaration))
  (^js [declaration source-file]
   (.getChildren ^js declaration source-file)))

(defn start
  (^js [declaration]
   (.getStart ^js declaration))
  (^js [declaration source-file]
   (.getStart ^js declaration source-file))
  (^js [declaration source-file include-js-doc-comment?]
   (.getStart ^js declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [declaration]
  (.getFullStart ^js declaration))

(defn get-end
  ^js [declaration]
  (.getEnd ^js declaration))

(defn width
  (^js [declaration]
   (.getWidth ^js declaration))
  (^js [declaration source-file]
   (.getWidth ^js declaration source-file)))

(defn full-width
  ^js [declaration]
  (.getFullWidth ^js declaration))

(defn leading-trivia-width
  (^js [declaration]
   (.getLeadingTriviaWidth ^js declaration))
  (^js [declaration source-file]
   (.getLeadingTriviaWidth ^js declaration source-file)))

(defn full-text
  (^js [declaration]
   (.getFullText ^js declaration))
  (^js [declaration source-file]
   (.getFullText ^js declaration source-file)))

(defn text
  (^js [declaration]
   (.getText ^js declaration))
  (^js [declaration source-file]
   (.getText ^js declaration source-file)))

(defn first-token
  (^js [declaration]
   (.getFirstToken ^js declaration))
  (^js [declaration source-file]
   (.getFirstToken ^js declaration source-file)))

(defn last-token
  (^js [declaration]
   (.getLastToken ^js declaration))
  (^js [declaration source-file]
   (.getLastToken ^js declaration source-file)))

(defn for-each-child
  (^js [declaration cb-node]
   (.forEachChild ^js declaration cb-node))
  (^js [declaration cb-node cb-node-array]
   (.forEachChild ^js declaration cb-node cb-node-array)))

(defn decorators
  ^js [declaration]
  (.-decorators ^js declaration))

(defn modifiers
  ^js [declaration]
  (.-modifiers ^js declaration))

(defn pos
  ^js [declaration]
  (.-pos ^js declaration))

(defn end
  ^js [declaration]
  (.-end ^js declaration))
