(ns leitor.subscriptions)

(defn- load-feeds-for [user-id]
  ["http://weblog.rubyonrails.org/feed/atom.xml"
   "http://feeds.feedburner.com/lucapette"])

(defn- parse [feed] feed)

(defn for-user [user-id]
  (map parse (load-feeds-for user-id)))
