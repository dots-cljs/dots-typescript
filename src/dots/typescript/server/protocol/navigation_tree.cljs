(ns dots.typescript.server.protocol.navigation-tree
  "protocol.NavigationTree is identical to ts.NavigationTree, except using protocol.TextSpan instead of ts.TextSpan")

(defn text
  ^js [navigation-tree]
  (.-text ^js navigation-tree))

(defn set-text!
  ^js [navigation-tree value]
  (set! (.-text ^js navigation-tree) value))

(defn kind
  ^js [navigation-tree]
  (.-kind ^js navigation-tree))

(defn set-kind!
  ^js [navigation-tree value]
  (set! (.-kind ^js navigation-tree) value))

(defn kind-modifiers
  ^js [navigation-tree]
  (.-kindModifiers ^js navigation-tree))

(defn set-kind-modifiers!
  ^js [navigation-tree value]
  (set! (.-kindModifiers ^js navigation-tree) value))

(defn spans
  ^js [navigation-tree]
  (.-spans ^js navigation-tree))

(defn set-spans!
  ^js [navigation-tree value]
  (set! (.-spans ^js navigation-tree) value))

(defn name-span
  ^js [navigation-tree]
  (.-nameSpan ^js navigation-tree))

(defn set-name-span!
  ^js [navigation-tree value]
  (set! (.-nameSpan ^js navigation-tree) value))

(defn child-items
  ^js [navigation-tree]
  (.-childItems ^js navigation-tree))

(defn set-child-items!
  ^js [navigation-tree value]
  (set! (.-childItems ^js navigation-tree) value))
