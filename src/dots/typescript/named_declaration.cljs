(ns dots.typescript.named-declaration
  (:refer-clojure :exclude [name]))

(defn name
  ^js [named-declaration]
  (.-name ^js named-declaration))

(defn kind
  ^js [named-declaration]
  (.-kind ^js named-declaration))

(defn flags
  ^js [named-declaration]
  (.-flags ^js named-declaration))

(defn parent
  ^js [named-declaration]
  (.-parent ^js named-declaration))

(defn source-file
  ^js [named-declaration]
  (.getSourceFile ^js named-declaration))

(defn child-count
  (^js [named-declaration]
   (.getChildCount ^js named-declaration))
  (^js [named-declaration source-file]
   (.getChildCount ^js named-declaration source-file)))

(defn child-at
  (^js [named-declaration index]
   (.getChildAt ^js named-declaration index))
  (^js [named-declaration index source-file]
   (.getChildAt ^js named-declaration index source-file)))

(defn children
  (^js [named-declaration]
   (.getChildren ^js named-declaration))
  (^js [named-declaration source-file]
   (.getChildren ^js named-declaration source-file)))

(defn start
  (^js [named-declaration]
   (.getStart ^js named-declaration))
  (^js [named-declaration source-file]
   (.getStart ^js named-declaration source-file))
  (^js [named-declaration source-file include-js-doc-comment?]
   (.getStart ^js named-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [named-declaration]
  (.getFullStart ^js named-declaration))

(defn get-end
  ^js [named-declaration]
  (.getEnd ^js named-declaration))

(defn width
  (^js [named-declaration]
   (.getWidth ^js named-declaration))
  (^js [named-declaration source-file]
   (.getWidth ^js named-declaration source-file)))

(defn full-width
  ^js [named-declaration]
  (.getFullWidth ^js named-declaration))

(defn leading-trivia-width
  (^js [named-declaration]
   (.getLeadingTriviaWidth ^js named-declaration))
  (^js [named-declaration source-file]
   (.getLeadingTriviaWidth ^js named-declaration source-file)))

(defn full-text
  (^js [named-declaration]
   (.getFullText ^js named-declaration))
  (^js [named-declaration source-file]
   (.getFullText ^js named-declaration source-file)))

(defn text
  (^js [named-declaration]
   (.getText ^js named-declaration))
  (^js [named-declaration source-file]
   (.getText ^js named-declaration source-file)))

(defn first-token
  (^js [named-declaration]
   (.getFirstToken ^js named-declaration))
  (^js [named-declaration source-file]
   (.getFirstToken ^js named-declaration source-file)))

(defn last-token
  (^js [named-declaration]
   (.getLastToken ^js named-declaration))
  (^js [named-declaration source-file]
   (.getLastToken ^js named-declaration source-file)))

(defn for-each-child
  (^js [named-declaration cb-node]
   (.forEachChild ^js named-declaration cb-node))
  (^js [named-declaration cb-node cb-node-array]
   (.forEachChild ^js named-declaration cb-node cb-node-array)))

(defn pos
  ^js [named-declaration]
  (.-pos ^js named-declaration))

(defn end
  ^js [named-declaration]
  (.-end ^js named-declaration))
