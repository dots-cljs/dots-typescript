(ns dots.typescript.class-static-block-declaration
  (:refer-clojure :exclude [name]))

(defn kind
  ^js [class-static-block-declaration]
  (.-kind ^js class-static-block-declaration))

(defn parent
  ^js [class-static-block-declaration]
  (.-parent ^js class-static-block-declaration))

(defn body
  ^js [class-static-block-declaration]
  (.-body ^js class-static-block-declaration))

(defn name
  ^js [class-static-block-declaration]
  (.-name ^js class-static-block-declaration))

(defn flags
  ^js [class-static-block-declaration]
  (.-flags ^js class-static-block-declaration))

(defn source-file
  ^js [class-static-block-declaration]
  (.getSourceFile ^js class-static-block-declaration))

(defn child-count
  (^js [class-static-block-declaration]
   (.getChildCount ^js class-static-block-declaration))
  (^js [class-static-block-declaration source-file]
   (.getChildCount ^js class-static-block-declaration source-file)))

(defn child-at
  (^js [class-static-block-declaration index]
   (.getChildAt ^js class-static-block-declaration index))
  (^js [class-static-block-declaration index source-file]
   (.getChildAt ^js class-static-block-declaration index source-file)))

(defn children
  (^js [class-static-block-declaration]
   (.getChildren ^js class-static-block-declaration))
  (^js [class-static-block-declaration source-file]
   (.getChildren ^js class-static-block-declaration source-file)))

(defn start
  (^js [class-static-block-declaration]
   (.getStart ^js class-static-block-declaration))
  (^js [class-static-block-declaration source-file]
   (.getStart ^js class-static-block-declaration source-file))
  (^js [class-static-block-declaration source-file include-js-doc-comment?]
   (.getStart ^js class-static-block-declaration source-file include-js-doc-comment?)))

(defn full-start
  ^js [class-static-block-declaration]
  (.getFullStart ^js class-static-block-declaration))

(defn get-end
  ^js [class-static-block-declaration]
  (.getEnd ^js class-static-block-declaration))

(defn width
  (^js [class-static-block-declaration]
   (.getWidth ^js class-static-block-declaration))
  (^js [class-static-block-declaration source-file]
   (.getWidth ^js class-static-block-declaration source-file)))

(defn full-width
  ^js [class-static-block-declaration]
  (.getFullWidth ^js class-static-block-declaration))

(defn leading-trivia-width
  (^js [class-static-block-declaration]
   (.getLeadingTriviaWidth ^js class-static-block-declaration))
  (^js [class-static-block-declaration source-file]
   (.getLeadingTriviaWidth ^js class-static-block-declaration source-file)))

(defn full-text
  (^js [class-static-block-declaration]
   (.getFullText ^js class-static-block-declaration))
  (^js [class-static-block-declaration source-file]
   (.getFullText ^js class-static-block-declaration source-file)))

(defn text
  (^js [class-static-block-declaration]
   (.getText ^js class-static-block-declaration))
  (^js [class-static-block-declaration source-file]
   (.getText ^js class-static-block-declaration source-file)))

(defn first-token
  (^js [class-static-block-declaration]
   (.getFirstToken ^js class-static-block-declaration))
  (^js [class-static-block-declaration source-file]
   (.getFirstToken ^js class-static-block-declaration source-file)))

(defn last-token
  (^js [class-static-block-declaration]
   (.getLastToken ^js class-static-block-declaration))
  (^js [class-static-block-declaration source-file]
   (.getLastToken ^js class-static-block-declaration source-file)))

(defn for-each-child
  (^js [class-static-block-declaration cb-node]
   (.forEachChild ^js class-static-block-declaration cb-node))
  (^js [class-static-block-declaration cb-node cb-node-array]
   (.forEachChild ^js class-static-block-declaration cb-node cb-node-array)))

(defn pos
  ^js [class-static-block-declaration]
  (.-pos ^js class-static-block-declaration))

(defn end
  ^js [class-static-block-declaration]
  (.-end ^js class-static-block-declaration))
